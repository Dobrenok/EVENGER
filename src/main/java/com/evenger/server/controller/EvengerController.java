package com.evenger.server.controller;

import com.evenger.server.entity.Event;
import com.evenger.server.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/evenger")
public class EvengerController
{
    @Autowired
    private EventRepository repository;

    //Temp
    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public @ResponseBody List<Event> getEvent(ModelMap model)
    {
        return repository.findAll();
    }

}
