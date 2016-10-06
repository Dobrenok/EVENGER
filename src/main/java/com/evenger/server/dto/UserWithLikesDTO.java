package com.evenger.server.dto;

import com.evenger.server.entity.Event;
import com.evenger.server.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserWithLikesDTO extends UserDTO
{
    protected List<Long> likeEvents;

    public UserWithLikesDTO(User user)
    {
        super(user);

        this.likeEvents = new ArrayList<Long>();

        for (Event event : user.getLikeEvents())
            likeEvents.add(event.getId());
    }

    public List<Long> getLikeEvents() {
        return likeEvents;
    }

    public void setLikeEvents(List<Long> likeEvents) {
        this.likeEvents = likeEvents;
    }
}
