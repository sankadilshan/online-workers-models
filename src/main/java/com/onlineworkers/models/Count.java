package com.onlineworkers.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "_count")
@Data
public class Count {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long likes;
    private long comments;
    private long profileOwnerId; //to whom like

    public Count(){}

    public Count(long likes, long comments, long profileOwnerId) {
        this.likes = likes;
        this.comments=comments;
        this.profileOwnerId = profileOwnerId;
    }

}
