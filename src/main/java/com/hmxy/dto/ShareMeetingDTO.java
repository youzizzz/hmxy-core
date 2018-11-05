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
    private String  creator_by;
    private Date creator_date;
    private String  update_by;
    private Date  update_date;
    private String  sm_id;
    private String  category_id;
    private String  detail_id;
    private String  area_id;
    private String  title;
    private String  logo_url ;
    private String  association_user ;
    private String  share_id;
    private String  status ;
    private Date  share_time ;


}
