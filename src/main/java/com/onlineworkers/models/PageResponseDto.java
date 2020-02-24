package com.onlineworkers.models;

import lombok.Data;

import java.util.List;
@Data
public class PageResponseDto {
    private int pageSize;
    private int pageNumber;
    private int totalPage;
    private int totalElement;
    private long allTotalElement;
    private List<Comments> result;

    public PageResponseDto(int pageSize, int pageNumber, int totalPage, int totalElement, long allTotalElement, List<Comments> result) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalPage = totalPage;
        this.totalElement = totalElement;
        this.allTotalElement = allTotalElement;
        this.result = result;
    }


}


