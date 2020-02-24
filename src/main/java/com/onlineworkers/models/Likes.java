package com.onlineworkers.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "_likes") //the persons who liked
@Data
public class Likes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long likerId;
    private String lUsername; // username who is liked
    private long likeId; //this is equal to Like.id
    private boolean status=true;

    public Likes(long likerId,String lUsername, long likeId, boolean status) {
        this.likerId = likerId;
        this.lUsername=lUsername;
        this.likeId = likeId;
        this.status = status;
    }
    public Likes() {}
}
