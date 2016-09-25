package com.evenger.server.service;

import com.evenger.server.entity.Event;

import java.util.List;

public interface EventService
{
    Event addEvent(Event event);
    void delete(long id);
    List<Event> getLastEvents();
    List<Event> getLastEvents(long startIndex);
}
