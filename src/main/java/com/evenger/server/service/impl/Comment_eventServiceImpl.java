package com.evenger.server.service.impl;

import com.evenger.server.entity.Comment;
import com.evenger.server.repository.Comment_eventRepository;
import com.evenger.server.service.Comment_eventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Comment_eventServiceImpl implements Comment_eventService
{
    @Autowired
    private Comment_eventRepository comment_eventRepository;

    public List<Comment> getLastCommentsForEvent(long eventId) {
        return null;
    }

    public List<Comment> getLastCommentsForEvent(long eventId, long startSN) {
        return null;
    }
}
