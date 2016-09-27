package com.evenger.server.dto;

import com.evenger.server.entity.Event;

import java.util.List;

public class EventListDTO
{
    private List<Event> events;

    public EventListDTO() {
    }

    public EventListDTO(List<Event> events)
    {
        this.events = events;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
