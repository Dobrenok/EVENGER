package com.evenger.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/evenger")
public class EvengerController
{
    //Temp
    @RequestMapping(value = "/event", method = RequestMethod.GET)
    public @ResponseBody String getEvent(ModelMap model)
    {
        return "New event";
    }
}
