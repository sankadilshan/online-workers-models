package com.onlineworkers.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Data
public class PostUserInformation {
    @JsonIgnore
    private long id;
    private String jobTitle;
    @JsonIgnore
    private String name;
    private String province;
    private String address;
    private String description;
    @JsonIgnore
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date registerDate=new Date();
    @JsonIgnore
    private long userId;
}
