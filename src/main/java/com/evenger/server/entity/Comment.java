package com.evenger.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "Comment")
public class Comment
{
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "serialNumber", nullable = false)
    private long serialNumber;

    @Column(name = "authorName")
    private String authorName;

    @Column(name = "text", nullable = false)
    private String text;

    public Comment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
