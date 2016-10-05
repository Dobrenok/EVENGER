package com.evenger.server.service.impl;

import com.evenger.server.entity.Event;
import com.evenger.server.entity.User;
import com.evenger.server.repository.EventRepository;
import com.evenger.server.repository.UserRepository;
import com.evenger.server.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EventServiceImpl implements EventService
{
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    public Event addEvent(Event event) {
        return eventRepository.saveAndFlush(event);
    }

    public void delete(long id) {
        eventRepository.delete(id);
    }

    public List<Event> getLastEvents() {

        return eventRepository.findTop10ByOrderByIdDesc();
    }

    public List<Event> getLastEvents(long startIndex) {

        return eventRepository.findTop10ByIdLessThanOrderByIdDesc(startIndex);
    }

    public int addLike(long eventId, long userId) {

        Event event = eventRepository.findOne(eventId);
        User user = userRepository.findOne(userId);

        int code = 1;

        if (!event.getLikes().contains(user))
        {
            event.getLikes().add(user);
        }
        else
        {
            event.getLikes().remove(user);
            code = -1;
        }

        event.setNumberOfLikes(event.getNumberOfLikes() + code);

        eventRepository.saveAndFlush(event);

        return code;
    }
}
