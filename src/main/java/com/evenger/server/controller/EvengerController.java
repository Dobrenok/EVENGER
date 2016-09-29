package com.evenger.server.controller;

import com.evenger.server.dto.CommentListDTO;
import com.evenger.server.dto.EventListDTO;
import com.evenger.server.service.Comment_eventService;
import com.evenger.server.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EvengerController
{
    @Autowired
    private EventService eventService;

    @Autowired
    private Comment_eventService comment_eventService;

    @RequestMapping(value = "/feed", method = RequestMethod.GET)
    public @ResponseBody EventListDTO getFeed()
    {
        return new EventListDTO(eventService.getLastEvents());
    }

    @RequestMapping(value = "/feed/{startID}", method = RequestMethod.GET)
    public @ResponseBody EventListDTO getFeed(@PathVariable("startID") long startID)
    {
        return new EventListDTO(eventService.getLastEvents(startID));
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public @ResponseBody CommentListDTO getComments(@RequestParam(value = "eventID") long eventId)
    {
        return new CommentListDTO(comment_eventService.getLastCommentsForEvent(eventId));
    }

    @RequestMapping(value = "/comments/{startSN}", method = RequestMethod.GET)
    public @ResponseBody CommentListDTO getComments(@RequestParam(value = "eventID") long eventId,
                                             @PathVariable("startSN") long startSN)
    {
        return new CommentListDTO(comment_eventService.getLastCommentsForEvent(eventId, startSN));
    }
}
