package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
public class ShareMeetingDTO implements Serializable{
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
    private Date creatorDate;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
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
    private Date shareEndTime;

    /**
     * 费用
     */
    private String charge;


}
