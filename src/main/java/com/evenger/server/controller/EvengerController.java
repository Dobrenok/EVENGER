package com.evenger.server.controller;

import com.evenger.server.dto.CommentListDTO;
import com.evenger.server.dto.EventListDTO;
import com.evenger.server.service.EventService;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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

    @RequestMapping(value = "/feed/{startID}", method = RequestMethod.GET)
    public @ResponseBody EventListDTO getFeed(@PathVariable("startID") long startID)
    {
        return new EventListDTO(eventService.getLastEvents(startID));
    }

    @RequestMapping(value = "/comments", method = RequestMethod.GET)
    public @ResponseBody CommentListDTO getComments(@RequestParam(value = "eventID") long eventId)
    {
        return new CommentListDTO();
    }

    @RequestMapping(value = "/comments/{startSN}", method = RequestMethod.GET)
    public @ResponseBody CommentListDTO getComments(@RequestParam(value = "eventID") long eventId,
                                                    @PathVariable("startSN") long startSN)
    {
        return new CommentListDTO();
    }

    @RequestMapping(value = "/like", method = RequestMethod.POST)
    public @ResponseBody void addLike(@RequestBody long eventId)
    {
        eventService.addLike(eventId);
    }

    @RequestMapping(value = "/images/{kind}", method = RequestMethod.GET)
    public void getImage(HttpServletResponse response,
                         @PathVariable("kind") String kind,
                         @RequestParam(value = "name") String name) throws IOException
    {
        InputStream inputStream = new FileInputStream("/store/images/" + kind +"/" + name);

        try
        {
            response.setContentType("image/jpeg");
            IOUtils.copy(inputStream, response.getOutputStream());

        } finally {

            IOUtils.closeQuietly(inputStream);
        }
    }
}
