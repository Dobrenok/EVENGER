package com.evenger.server.repository;

import com.evenger.server.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long>
{
    List<Event> findTop10ByOrderByIdDesc();

    List<Event> findTop10ByIdLessThanOrderByIdDesc(long id);
}