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
@Table(name="sys_share_meeting")
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
