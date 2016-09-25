package com.evenger.server.controller;

import com.evenger.server.entity.Event;
import com.evenger.server.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EvengerController
{
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/feed", method = RequestMethod.GET)
    public @ResponseBody List<Event> getFeed()
    {
        return eventService.getLastEvents();
    }

    @RequestMapping(value = "/feed/{id}", method = RequestMethod.GET)
    public @ResponseBody List<Event> getFeed(@PathVariable("id") long id)
    {
        return eventService.getLastEvents(id);
    }

}
