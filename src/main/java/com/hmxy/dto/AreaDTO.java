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
@Table(name="sys_area")
public class AreaDTO implements Serializable{
    private String  creator_by;
    private Date creator_date;
    private String  update_by;
    private Date  update_date;
    private String  are_id;
    private String  city_code;
    private String  city_name;
    private String  province_code;
    private String  province_name;
    private String  status ;


}
