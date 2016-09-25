package com.evenger.server.service.impl;

import com.evenger.server.entity.Event;
import com.evenger.server.repository.EventRepository;
import com.evenger.server.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService
{
    @Autowired
    private EventRepository eventRepository;

    public Event addEvent(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    public void delete(long id) {
        eventRepository.delete(id);
    }

    public List<Event> getLastEvents(int count) {
        //TODO realisation
        return eventRepository.findAll();
    }

    public List<Event> getLastEvents(int count, int startIndex) {
        //TODO realisation
        return eventRepository.findAll();
    }
}
