package com.evenger.server.dto;

import com.evenger.server.entity.Event;
import com.evenger.server.entity.enums.Category;

import java.util.Date;

public class EventDTO
{
    private long id;
    private String title;
    private Date date;
    private String address;
    private int maxNumberOfPeople;
    private String description;
    private Category category;
    private int currentNumberOfPeople;
    private int numberOfLikes;
    private UserDTO author;
    private String imageName;
    private boolean isChecked;

    public EventDTO() {
    }

    public EventDTO(Event event)
    {
        this.id = event.getId();
        this.title = event.getTitle();
        this.date = event.getDate();
        this.address = event.getAddress();
        this.maxNumberOfPeople = event.getMaxNumberOfPeople();
        this.description = event.getDescription();
        this.category = event.getCategory();
        this.currentNumberOfPeople = event.getCurrentNumberOfPeople();
        this.numberOfLikes = event.getNumberOfLikes();
        this.author = new UserDTO(event.getAuthor());
        this.imageName = event.getImageName();
        this.isChecked = event.isChecked();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMaxNumberOfPeople() {
        return maxNumberOfPeople;
    }

    public void setMaxNumberOfPeople(int maxNumberOfPeople) {
        this.maxNumberOfPeople = maxNumberOfPeople;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getCurrentNumberOfPeople() {
        return currentNumberOfPeople;
    }

    public void setCurrentNumberOfPeople(int currentNumberOfPeople) {
        this.currentNumberOfPeople = currentNumberOfPeople;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public UserDTO getAuthor() {
        return author;
    }

    public void setAuthor(UserDTO author) {
        this.author = author;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
