package com.evenger.server.service;

import com.evenger.server.entity.Event_user;

public interface Event_userService
{
    Event_user addEvent_user(Event_user event_user);
    void delete(long id);
}
