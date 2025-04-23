package com.entity.model;

import com.entity.XiaofeijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 消费记录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XiaofeijiluModel implements Serializable {
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
     * 消费名称
     */
    private String xiaofeijiluName;


    /**
     * 消费类型
     */
    private Integer xiaofeijiluTypes;


    /**
     * 消费时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date anpaiTime;


    /**
     * 消费金额
     */
    private Double xiaofeiJine;


    /**
     * 消费详情
     */
    private String xiaofeijiluContent;


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
	 * 获取：消费名称
	 */
    public String getXiaofeijiluName() {
        return xiaofeijiluName;
    }


    /**
	 * 设置：消费名称
	 */
    public void setXiaofeijiluName(String xiaofeijiluName) {
        this.xiaofeijiluName = xiaofeijiluName;
    }
    /**
	 * 获取：消费类型
	 */
    public Integer getXiaofeijiluTypes() {
        return xiaofeijiluTypes;
    }


    /**
	 * 设置：消费类型
	 */
    public void setXiaofeijiluTypes(Integer xiaofeijiluTypes) {
        this.xiaofeijiluTypes = xiaofeijiluTypes;
    }
    /**
	 * 获取：消费时间
	 */
    public Date getAnpaiTime() {
        return anpaiTime;
    }


    /**
	 * 设置：消费时间
	 */
    public void setAnpaiTime(Date anpaiTime) {
        this.anpaiTime = anpaiTime;
    }
    /**
	 * 获取：消费金额
	 */
    public Double getXiaofeiJine() {
        return xiaofeiJine;
    }


    /**
	 * 设置：消费金额
	 */
    public void setXiaofeiJine(Double xiaofeiJine) {
        this.xiaofeiJine = xiaofeiJine;
    }
    /**
	 * 获取：消费详情
	 */
    public String getXiaofeijiluContent() {
        return xiaofeijiluContent;
    }


    /**
	 * 设置：消费详情
	 */
    public void setXiaofeijiluContent(String xiaofeijiluContent) {
        this.xiaofeijiluContent = xiaofeijiluContent;
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
