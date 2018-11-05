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
    private String  creatorBy;
    private Date creatorDate;
    private String  updateBy;
    private Date  updateDate;
    private String  areId;
    private String  cityCode;
    private String  cityName;
    private String  provinceCode;
    private String  provinceName;
    private String  status ;


}
