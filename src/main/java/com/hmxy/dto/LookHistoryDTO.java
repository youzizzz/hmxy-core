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
@Table(name="sys_lookhistory")
public class LookHistoryDTO implements Serializable{
    private String  creator_by;
    private Date creator_date;
    private String  update_by;
    private Date  update_date;
    private String  lh_id;
    private String  share_id;
    private Date  look_time ;
    private String  status;


}
