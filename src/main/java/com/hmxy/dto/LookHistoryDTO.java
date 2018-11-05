package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LookHistoryDTO implements Serializable{
    private String  creatorBy;
    private Date creatorDate;
    private String  updateBy;
    private Date  updateDate;
    private String  lhId;
    private String  shareId;
    private Date  lookTime ;
    private String  status;


}
