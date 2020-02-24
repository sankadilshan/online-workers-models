package com.onlineworkers.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ResponseUserInfo {
    @JsonIgnore
    private long id;
    private String jobTitle;
    private String name;
    @JsonIgnore
    private String province;
    private String city;
    private String address;
    private String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date registerDate=new Date();
    private long userId;
}
