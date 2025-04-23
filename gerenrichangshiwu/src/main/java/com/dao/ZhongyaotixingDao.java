package com.dao;

import com.entity.ZhongyaotixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongyaotixingView;

/**
 * 重要提醒 Dao 接口
 *
 * @author 
 */
public interface ZhongyaotixingDao extends BaseMapper<ZhongyaotixingEntity> {

   List<ZhongyaotixingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
