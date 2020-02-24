package com.onlineworkers.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;


@Data
@AllArgsConstructor
public class CommentResponseDto {
    private long commentCount;
    private Collection<Comments> results;
}
