package com.onlineworkers.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "_comments")
@Data
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long commenterId;
    private String cUsername;
    private String comment;
    private long likeId;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm")
    private Date createDate=new Date();

    public Comments(){}

    public Comments(long commenterId,String cUsername , String comment, long likeId) {
        this.commenterId = commenterId;
        this.cUsername=cUsername;
        this.comment = comment;
        this.likeId = likeId;
    }
}
