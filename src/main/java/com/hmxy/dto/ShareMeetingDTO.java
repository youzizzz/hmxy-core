package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
public class ShareMeetingDTO implements Serializable{
    private String  creatorBy;
    private Date creatorDate;
    private String  updateBy;
    private Date  updateDate;
    private String  smId;
    private String  categoryId;
    private String  detailId;
    private String  areaId;
    private String  title;
    private String  logoUrl ;
    private String  associationUser ;
    private String  shareId;
    private String  status ;
    private Date  shareTime ;


}
