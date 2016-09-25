package com.evenger.server.service.impl;

import com.evenger.server.entity.Event_user;
import com.evenger.server.repository.Event_userRepository;
import com.evenger.server.service.Event_userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Event_userServiceImpl implements Event_userService
{
    @Autowired
    private Event_userRepository event_userRepository;

    public Event_user addEvent_user(Event_user event_user) {
        return event_userRepository.save(event_user);
    }

    public void delete(long id) {
        event_userRepository.delete(id);
    }
}
