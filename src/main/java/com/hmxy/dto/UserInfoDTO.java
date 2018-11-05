package com.hmxy.dto;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import jdk.nashorn.internal.ir.annotations.Immutable;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
/**用户信息表*/
@Entity
@lombok.Setter
@lombok.Getter
@ToString
@Table(name="sys_user")
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
