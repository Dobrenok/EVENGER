package com.evenger.server.controller;

import com.evenger.server.entity.Event;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evenger")
public class EvengerController
{
    //Temp
    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public @ResponseBody Event getEvent(ModelMap model)
    {
        return createTestEvent();
    }

    private Event createTestEvent()
    {
        Event event = new Event();
        event.setId(1);
        event.setCount(12);
        event.setName("EventName");

        return event;
    }
}
