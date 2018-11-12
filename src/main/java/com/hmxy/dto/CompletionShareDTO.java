package com.hmxy.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
public class CompletionShareDTO implements Serializable{
    private String  creatorBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creatorDate;
    private String  updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date  updateDate;
    private String  csId;
    private String  userId;
    private String  completionId;
    private String  userIp;
    private String  shareTitle;
    private String  catalogId ;
    private String  shareTime ;
    private String  areaId;
    private String  description ;
    private String  status ;
    private String originalLink;

}
