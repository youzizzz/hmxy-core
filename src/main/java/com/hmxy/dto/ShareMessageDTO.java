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
@Table(name="sys_sharemessage")
public class ShareMessageDTO implements Serializable{
    private String  creator_by;
    private Date  creator_date;
    private String  update_by;
    private Date update_date;
    private String  message_id;
    private String  message_title;
    private String  message_content;
    private String  message_type;
    private String  message_read;
    private String  status;

}
