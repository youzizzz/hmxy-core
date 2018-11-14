package com.hmxy.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
public class ShareMeetDTO implements Serializable{
    /**
     * 主键
     */
    private String smId;

    /**
     * 创建人
     */
    private String creatorBy;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creatorDate;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 详情ID
     */
    private String detailId;

    /**
     * 区域ID
     */
    private String areaId;

    /**
     * 标题
     */
    private String title;

    /**
     * 图片链接
     */
    private String logoUrl;

    /**
     * 开始分享时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date shareStartTime;

    /**
     * 分享者ID
     */
    private String shareId;

    /**
     * 状态[0:可用,1:不可用]
     */
    private String status;

    /**
     * 结束分享时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date shareEndTime;

    /**
     * 费用
     */
    private String charge;


}
