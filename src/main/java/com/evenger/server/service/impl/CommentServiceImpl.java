package com.evenger.server.service.impl;

import com.evenger.server.repository.CommentRepository;
import com.evenger.server.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService
{
    @Autowired
    private CommentRepository commentRepository;
}
