package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 消费记录
 *
 * @author 
 * @email
 */
@TableName("xiaofeijilu")
public class XiaofeijiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XiaofeijiluEntity() {

	}

	public XiaofeijiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 消费名称
     */
    @TableField(value = "xiaofeijilu_name")

    private String xiaofeijiluName;


    /**
     * 消费类型
     */
    @TableField(value = "xiaofeijilu_types")

    private Integer xiaofeijiluTypes;


    /**
     * 消费时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "anpai_time")

    private Date anpaiTime;


    /**
     * 消费金额
     */
    @TableField(value = "xiaofei_jine")

    private Double xiaofeiJine;


    /**
     * 消费详情
     */
    @TableField(value = "xiaofeijilu_content")

    private String xiaofeijiluContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：消费名称
	 */
    public String getXiaofeijiluName() {
        return xiaofeijiluName;
    }
    /**
	 * 获取：消费名称
	 */

    public void setXiaofeijiluName(String xiaofeijiluName) {
        this.xiaofeijiluName = xiaofeijiluName;
    }
    /**
	 * 设置：消费类型
	 */
    public Integer getXiaofeijiluTypes() {
        return xiaofeijiluTypes;
    }
    /**
	 * 获取：消费类型
	 */

    public void setXiaofeijiluTypes(Integer xiaofeijiluTypes) {
        this.xiaofeijiluTypes = xiaofeijiluTypes;
    }
    /**
	 * 设置：消费时间
	 */
    public Date getAnpaiTime() {
        return anpaiTime;
    }
    /**
	 * 获取：消费时间
	 */

    public void setAnpaiTime(Date anpaiTime) {
        this.anpaiTime = anpaiTime;
    }
    /**
	 * 设置：消费金额
	 */
    public Double getXiaofeiJine() {
        return xiaofeiJine;
    }
    /**
	 * 获取：消费金额
	 */

    public void setXiaofeiJine(Double xiaofeiJine) {
        this.xiaofeiJine = xiaofeiJine;
    }
    /**
	 * 设置：消费详情
	 */
    public String getXiaofeijiluContent() {
        return xiaofeijiluContent;
    }
    /**
	 * 获取：消费详情
	 */

    public void setXiaofeijiluContent(String xiaofeijiluContent) {
        this.xiaofeijiluContent = xiaofeijiluContent;
    }
    /**
	 * 设置：记录时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：记录时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xiaofeijilu{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", xiaofeijiluName=" + xiaofeijiluName +
            ", xiaofeijiluTypes=" + xiaofeijiluTypes +
            ", anpaiTime=" + anpaiTime +
            ", xiaofeiJine=" + xiaofeiJine +
            ", xiaofeijiluContent=" + xiaofeijiluContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
