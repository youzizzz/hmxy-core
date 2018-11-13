package com.hmxy.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ZhangHuan
 */
@Data
public class UserInfoDTO implements Serializable {
    private String creatorBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creatorDate;
    private String updateBy;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateDate;
    private String userId;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String address;
    private String userDecription;
    private String status;
    private String certificateCode;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthDate;
    private String Sex;
    private String jobName;

    @JsonIgnore
    private Date startTime;

    @JsonIgnore
    private Date endTime;

}
