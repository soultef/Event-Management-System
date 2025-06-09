package com.soultech.event_management.dto;

import com.soultech.event_management.enumeration.EventStatus;
import com.soultech.event_management.model.Event;

import java.time.LocalDateTime;

public class EventDtoResponse {
    private Long id;
    private String eventId;
    private String title;
    private String description;
    private String location;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private long totalTickets;
    private double price;
    private int availableTickets;
    private String imageUrl;
    private Enum<EventStatus> eventStatus;

    public EventDtoResponse(Long id, Enum<EventStatus> eventStatus, String imageUrl,
                            int availableTickets, double price, long totalTickets,
                            LocalDateTime endTime, LocalDateTime startTime,
                            String location, String description,
                            String title, String eventId) {
        this.id = id;
        this.eventStatus = eventStatus;
        this.imageUrl = imageUrl;
        this.availableTickets = availableTickets;
        this.price = price;
        this.totalTickets = totalTickets;
        this.endTime = endTime;
        this.startTime = startTime;
        this.location = location;
        this.description = description;
        this.title = title;
        this.eventId = eventId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public long getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(long totalTickets) {
        this.totalTickets = totalTickets;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Enum<EventStatus> getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(Enum<EventStatus> eventStatus) {
        this.eventStatus = eventStatus;
    }
}
