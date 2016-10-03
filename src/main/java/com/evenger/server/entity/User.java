package com.evenger.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "User")
public class User
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "login", unique = true, nullable = false)
    private String login;

    @Column(name = "avatarName")
    private String avatarName;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "likes")
    private Set<Event> likeEvents;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "subscribers")
    private Set<Event> eventsSubscribed;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private Set<Event> ownEvents;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatarName() {
        return avatarName;
    }

    public void setAvatarName(String avatarName) {
        this.avatarName = avatarName;
    }

    public Set<Event> getLikeEvents() {
        return likeEvents;
    }

    public void setLikeEvents(Set<Event> likeEvents) {
        this.likeEvents = likeEvents;
    }

    public Set<Event> getEventsSubscribed() {
        return eventsSubscribed;
    }

    public void setEventsSubscribed(Set<Event> eventsSubscribed) {
        this.eventsSubscribed = eventsSubscribed;
    }

    public Set<Event> getOwnEvents() {
        return ownEvents;
    }

    public void setOwnEvents(Set<Event> ownEvents) {
        this.ownEvents = ownEvents;
    }
}
