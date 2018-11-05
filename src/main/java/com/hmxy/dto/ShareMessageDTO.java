package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ShareMessageDTO implements Serializable{
    private String  creatorBy;
    private Date creatorDate;
    private String  updateBy;
    private Date  updateDate;
    private String  messageId;
    private String  messageTitle;
    private String  messageContent;
    private String  messageType;
    private String  messageRead;
    private String  status;

}
