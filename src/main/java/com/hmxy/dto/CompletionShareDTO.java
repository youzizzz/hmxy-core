package com.hmxy.dto;

import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@lombok.Setter
@lombok.Getter
@ToString
@Table(name="sys_completion_share")
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
