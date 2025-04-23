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
 * 日常安排
 *
 * @author 
 * @email
 */
@TableName("richanganpai")
public class RichanganpaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RichanganpaiEntity() {

	}

	public RichanganpaiEntity(T t) {
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
     * 安排名称
     */
    @TableField(value = "richanganpai_name")

    private String richanganpaiName;


    /**
     * 安排类型
     */
    @TableField(value = "richanganpai_types")

    private Integer richanganpaiTypes;


    /**
     * 安排时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "anpai_time")

    private Date anpaiTime;


    /**
     * 安排详情
     */
    @TableField(value = "richanganpai_content")

    private String richanganpaiContent;


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
	 * 设置：安排名称
	 */
    public String getRichanganpaiName() {
        return richanganpaiName;
    }
    /**
	 * 获取：安排名称
	 */

    public void setRichanganpaiName(String richanganpaiName) {
        this.richanganpaiName = richanganpaiName;
    }
    /**
	 * 设置：安排类型
	 */
    public Integer getRichanganpaiTypes() {
        return richanganpaiTypes;
    }
    /**
	 * 获取：安排类型
	 */

    public void setRichanganpaiTypes(Integer richanganpaiTypes) {
        this.richanganpaiTypes = richanganpaiTypes;
    }
    /**
	 * 设置：安排时间
	 */
    public Date getAnpaiTime() {
        return anpaiTime;
    }
    /**
	 * 获取：安排时间
	 */

    public void setAnpaiTime(Date anpaiTime) {
        this.anpaiTime = anpaiTime;
    }
    /**
	 * 设置：安排详情
	 */
    public String getRichanganpaiContent() {
        return richanganpaiContent;
    }
    /**
	 * 获取：安排详情
	 */

    public void setRichanganpaiContent(String richanganpaiContent) {
        this.richanganpaiContent = richanganpaiContent;
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
        return "Richanganpai{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", richanganpaiName=" + richanganpaiName +
            ", richanganpaiTypes=" + richanganpaiTypes +
            ", anpaiTime=" + anpaiTime +
            ", richanganpaiContent=" + richanganpaiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
