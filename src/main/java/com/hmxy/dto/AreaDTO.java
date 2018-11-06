package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
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
