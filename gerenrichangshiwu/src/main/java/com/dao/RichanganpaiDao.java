package com.dao;

import com.entity.RichanganpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.RichanganpaiView;

/**
 * 日常安排 Dao 接口
 *
 * @author 
 */
public interface RichanganpaiDao extends BaseMapper<RichanganpaiEntity> {

   List<RichanganpaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
