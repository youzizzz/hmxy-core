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
    private String  creator_by;
    private Date creator_date;
    private String  update_by;
    private Date  update_date;
    private String  user_id;
    private String  username;
    private String  password;
    private String  phone;
    private String  email;
    private String  address ;
    private String  user_decription ;
    private String  status;
    private String  certificateCode ;
    private Date  birthDate ;
    private String  Sex;


}
