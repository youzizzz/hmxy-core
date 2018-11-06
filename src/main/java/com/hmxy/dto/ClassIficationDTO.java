package com.hmxy.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
public class ClassIficationDTO implements Serializable{

    private String  creatorBy;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date creatorDate;
    private String  updateBy;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date  updateDate;
    private String  cfId;
    private String  categoryName;
    private String  status;



}
