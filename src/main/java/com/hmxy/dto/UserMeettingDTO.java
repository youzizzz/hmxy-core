package com.hmxy.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserMeettingDTO {
    /**
     * 主键
     */
    private String muId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 分享会ID
     */
    private String mettingId;

    /**
     * 状态[0:有效,1:失效]
     */
    private String status;

    /**
     * 最后更新时间
     */
    private Date lastUpdateTime;

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

}