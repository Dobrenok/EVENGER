package com.evenger.server.controller;

import com.evenger.server.dto.EventListDTO;
import com.evenger.server.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EvengerController
{
    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/feed", method = RequestMethod.GET)
    public @ResponseBody EventListDTO getFeed()
    {
        return new EventListDTO(eventService.getLastEvents());
    }

    @RequestMapping(value = "/feed/{id}", method = RequestMethod.GET)
    public @ResponseBody EventListDTO getFeed(@PathVariable("id") long id)
    {
        return new EventListDTO(eventService.getLastEvents(id));
    }

}
