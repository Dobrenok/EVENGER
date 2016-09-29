package com.evenger.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import static javax.persistence.CascadeType.*;
import static javax.persistence.CascadeType.DETACH;

@Entity
@Table(name = "Comment_event")
public class Comment_event
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {PERSIST, MERGE, REMOVE, REFRESH, DETACH})
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;

    @OneToOne(optional = false)
    @JoinColumn(name="comment_id", unique = true, nullable = false)
    private Comment comment;

    public Comment_event() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
