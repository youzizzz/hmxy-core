package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CompletionShareDTO implements Serializable{
    private String  creatorBy;
    private Date creatorDate;
    private String  updateBy;
    private Date  updateDate;
    private String  csId;
    private String  userId;
    private String  completionId;
    private String  userIp;
    private String  shareTitle;
    private String  catalogId ;
    private Date  shareTime ;
    private String  areaId;
    private String  description ;
    private String  status ;


}
