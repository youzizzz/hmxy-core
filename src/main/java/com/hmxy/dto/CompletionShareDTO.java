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
    private String  creator_by;
    private Date creator_date;
    private String  update_by;
    private Date  update_date;
    private String  cs_id;
    private String  user_id;
    private String  completion_id;
    private String  user_ip;
    private String  share_title;
    private String  catalog_id ;
    private Date  share_time ;
    private String  area_id;
    private String  description ;
    private String  status ;


}
