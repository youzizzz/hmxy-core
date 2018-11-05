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
@Table(name="sys_classification")
public class ClassIficationDTO implements Serializable{
    private String  creator_by;
    private Date creator_date;
    private String  update_by;
    private Date  update_date;
    private String  cf_id;
    private String  category_name;
    private String  status;



}
