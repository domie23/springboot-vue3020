package com.entity.vo;

import com.entity.ZhongyaotixingEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 重要提醒
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhongyaotixing")
public class ZhongyaotixingVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 提醒名称
     */

    @TableField(value = "zhongyaotixing_name")
    private String zhongyaotixingName;


    /**
     * 提醒类型
     */

    @TableField(value = "zhongyaotixing_types")
    private Integer zhongyaotixingTypes;


    /**
     * 提醒时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "anpai_time")
    private Date anpaiTime;


    /**
     * 提醒详情
     */

    @TableField(value = "zhongyaotixing_content")
    private String zhongyaotixingContent;


    /**
     * 记录时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：提醒名称
	 */
    public String getZhongyaotixingName() {
        return zhongyaotixingName;
    }


    /**
	 * 获取：提醒名称
	 */

    public void setZhongyaotixingName(String zhongyaotixingName) {
        this.zhongyaotixingName = zhongyaotixingName;
    }
    /**
	 * 设置：提醒类型
	 */
    public Integer getZhongyaotixingTypes() {
        return zhongyaotixingTypes;
    }


    /**
	 * 获取：提醒类型
	 */

    public void setZhongyaotixingTypes(Integer zhongyaotixingTypes) {
        this.zhongyaotixingTypes = zhongyaotixingTypes;
    }
    /**
	 * 设置：提醒时间
	 */
    public Date getAnpaiTime() {
        return anpaiTime;
    }


    /**
	 * 获取：提醒时间
	 */

    public void setAnpaiTime(Date anpaiTime) {
        this.anpaiTime = anpaiTime;
    }
    /**
	 * 设置：提醒详情
	 */
    public String getZhongyaotixingContent() {
        return zhongyaotixingContent;
    }


    /**
	 * 获取：提醒详情
	 */

    public void setZhongyaotixingContent(String zhongyaotixingContent) {
        this.zhongyaotixingContent = zhongyaotixingContent;
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

}
