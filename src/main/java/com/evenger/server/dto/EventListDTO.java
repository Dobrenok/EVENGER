package com.evenger.server.dto;

import com.evenger.server.entity.Event;

import java.util.ArrayList;
import java.util.List;

public class EventListDTO
{
    private List<EventDTO> events;

    public EventListDTO() {
    }

    public EventListDTO(List<Event> events)
    {
        this.events = new ArrayList<EventDTO>();

        for (Event event : events)
            this.events.add(new EventDTO(event));
    }

    public List<EventDTO> getEvents() {
        return events;
    }

    public void setEvents(List<EventDTO> events) {
        this.events = events;
    }
}
