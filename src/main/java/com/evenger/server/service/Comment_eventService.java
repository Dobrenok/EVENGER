package com.evenger.server.service;

import com.evenger.server.entity.Comment;

import java.util.List;

public interface Comment_eventService
{
    List<Comment> getLastCommentsForEvent(long eventId);
    List<Comment> getLastCommentsForEvent(long eventId, long startSN);
}
