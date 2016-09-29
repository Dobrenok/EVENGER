package com.evenger.server.dto;

import com.evenger.server.entity.Comment;

import java.util.List;

public class CommentListDTO
{
    private List<Comment> comments;

    public CommentListDTO() {
    }

    public CommentListDTO(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
