package com.hmxy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
public class UserInfoDTO implements Serializable{
    private String  creatorBy;
    private Date creatorDate;
    private String  updateBy;
    private Date  updateDate;
    private String  userId;
    private String  username;
    private String  password;
    private String  phone;
    private String  email;
    private String  address ;
    private String  userDecription ;
    private String  status;
    private String  certificateCode ;
    private Date  birthDate ;
    private String  Sex;


}
