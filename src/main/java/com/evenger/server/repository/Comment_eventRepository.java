package com.evenger.server.repository;

import com.evenger.server.entity.Comment;
import com.evenger.server.entity.Comment_event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Comment_eventRepository extends JpaRepository<Comment_event, Long>
{
    //TODO
}
