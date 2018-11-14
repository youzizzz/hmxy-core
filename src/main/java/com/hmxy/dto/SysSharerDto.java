package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class SysSharerDto implements Serializable {
    /**
     * 主键，分享者ID
     */
    private String sharerId;

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
     * 分享者名称
     */
    private String sharerName;

    /**
     * 图片地址
     */
    private String logUrl;

    /**
     * 分享者描述
     */
    private String userDecription;

    /**
     * 状态[0:可用,1:不可用]
     */
    private String status;

    /**
     * 性别[M:男,F:女]
     */
    private String sex;

    /**
     * 职业描述
     */
    private String jobDecription;

}