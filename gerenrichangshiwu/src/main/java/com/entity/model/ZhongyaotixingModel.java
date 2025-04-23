package com.entity.model;

import com.entity.ZhongyaotixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 重要提醒
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhongyaotixingModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 提醒名称
     */
    private String zhongyaotixingName;


    /**
     * 提醒类型
     */
    private Integer zhongyaotixingTypes;


    /**
     * 提醒时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date anpaiTime;


    /**
     * 提醒详情
     */
    private String zhongyaotixingContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：提醒名称
	 */
    public String getZhongyaotixingName() {
        return zhongyaotixingName;
    }


    /**
	 * 设置：提醒名称
	 */
    public void setZhongyaotixingName(String zhongyaotixingName) {
        this.zhongyaotixingName = zhongyaotixingName;
    }
    /**
	 * 获取：提醒类型
	 */
    public Integer getZhongyaotixingTypes() {
        return zhongyaotixingTypes;
    }


    /**
	 * 设置：提醒类型
	 */
    public void setZhongyaotixingTypes(Integer zhongyaotixingTypes) {
        this.zhongyaotixingTypes = zhongyaotixingTypes;
    }
    /**
	 * 获取：提醒时间
	 */
    public Date getAnpaiTime() {
        return anpaiTime;
    }


    /**
	 * 设置：提醒时间
	 */
    public void setAnpaiTime(Date anpaiTime) {
        this.anpaiTime = anpaiTime;
    }
    /**
	 * 获取：提醒详情
	 */
    public String getZhongyaotixingContent() {
        return zhongyaotixingContent;
    }


    /**
	 * 设置：提醒详情
	 */
    public void setZhongyaotixingContent(String zhongyaotixingContent) {
        this.zhongyaotixingContent = zhongyaotixingContent;
    }
    /**
	 * 获取：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：记录时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
