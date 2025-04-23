
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 日常安排
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/richanganpai")
public class RichanganpaiController {
    private static final Logger logger = LoggerFactory.getLogger(RichanganpaiController.class);

    @Autowired
    private RichanganpaiService richanganpaiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service
    @Autowired
    private YonghuService yonghuService;



    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = richanganpaiService.queryPage(params);

        //字典表数据转换
        List<RichanganpaiView> list =(List<RichanganpaiView>)page.getList();
        for(RichanganpaiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        RichanganpaiEntity richanganpai = richanganpaiService.selectById(id);
        if(richanganpai !=null){
            //entity转view
            RichanganpaiView view = new RichanganpaiView();
            BeanUtils.copyProperties( richanganpai , view );//把实体数据重构到view中

                //级联表
                YonghuEntity yonghu = yonghuService.selectById(richanganpai.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody RichanganpaiEntity richanganpai, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,richanganpai:{}",this.getClass().getName(),richanganpai.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            richanganpai.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<RichanganpaiEntity> queryWrapper = new EntityWrapper<RichanganpaiEntity>()
            .eq("yonghu_id", richanganpai.getYonghuId())
            .eq("richanganpai_name", richanganpai.getRichanganpaiName())
            .eq("richanganpai_types", richanganpai.getRichanganpaiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RichanganpaiEntity richanganpaiEntity = richanganpaiService.selectOne(queryWrapper);
        if(richanganpaiEntity==null){
            richanganpai.setInsertTime(new Date());
            richanganpai.setCreateTime(new Date());
            richanganpaiService.insert(richanganpai);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody RichanganpaiEntity richanganpai, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,richanganpai:{}",this.getClass().getName(),richanganpai.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            richanganpai.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        //根据字段查询是否有相同数据
        Wrapper<RichanganpaiEntity> queryWrapper = new EntityWrapper<RichanganpaiEntity>()
            .notIn("id",richanganpai.getId())
            .andNew()
            .eq("yonghu_id", richanganpai.getYonghuId())
            .eq("richanganpai_name", richanganpai.getRichanganpaiName())
            .eq("richanganpai_types", richanganpai.getRichanganpaiTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        RichanganpaiEntity richanganpaiEntity = richanganpaiService.selectOne(queryWrapper);
        if(richanganpaiEntity==null){
            richanganpaiService.updateById(richanganpai);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        richanganpaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<RichanganpaiEntity> richanganpaiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            RichanganpaiEntity richanganpaiEntity = new RichanganpaiEntity();
//                            richanganpaiEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            richanganpaiEntity.setRichanganpaiName(data.get(0));                    //安排名称 要改的
//                            richanganpaiEntity.setRichanganpaiTypes(Integer.valueOf(data.get(0)));   //安排类型 要改的
//                            richanganpaiEntity.setAnpaiTime(sdf.parse(data.get(0)));          //安排时间 要改的
//                            richanganpaiEntity.setRichanganpaiContent("");//详情和图片
//                            richanganpaiEntity.setInsertTime(date);//时间
//                            richanganpaiEntity.setCreateTime(date);//时间
                            richanganpaiList.add(richanganpaiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        richanganpaiService.insertBatch(richanganpaiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
