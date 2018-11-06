package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
public class ClassIficationDTO implements Serializable{
    private String  creatorBy;
    private Date creatorDate;
    private String  updateBy;
    private Date  updateDate;
    private String  cfId;
    private String  categoryName;
    private String  status;



}
