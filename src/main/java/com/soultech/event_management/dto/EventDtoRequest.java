package com.soultech.event_management.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public class EventDtoRequest {

    @NotBlank(message = "Event title should not be blank")
    private String title;
    @NotBlank(message = "Must add description for your event!")
    private String description;

    @NotBlank(message = "Must chose event location!")
    private String location;

    @NotNull
    @Future(message = "Start date and time must be in the future")
    private LocalDateTime startDateTime;

    @NotNull
    @Future(message = "End date and time must be in the future")
    private LocalDateTime endDateTime;

    @NotNull
    private long totalTickets;

    @NotNull
    private double price;
    @NotBlank(message = "must provide image url")
    private String imageUrl;

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
        return startDateTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startDateTime = startTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endDateTime = endTime;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
