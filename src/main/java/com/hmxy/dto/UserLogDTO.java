package com.hmxy.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志dto
 * @author  tangyouzhi
 */
@Data
public class UserLogDTO implements Serializable {

    private String id;
    private String userId;
    private String path;
    private String executeResult;
    private long executeTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;

}
