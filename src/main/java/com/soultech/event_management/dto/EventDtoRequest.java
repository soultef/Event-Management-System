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
    private int totalTickets;

    @NotNull
    private double price;

    @NotBlank(message = "must provide image url")
    private String imageUrl;

    public @NotBlank(message = "Event title should not be blank") String getTitle() {
        return title;
    }

    public void setTitle(@NotBlank(message = "Event title should not be blank") String title) {
        this.title = title;
    }

    public @NotBlank(message = "Must add description for your event!") String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank(message = "Must add description for your event!") String description) {
        this.description = description;
    }

    public @NotBlank(message = "Must chose event location!") String getLocation() {
        return location;
    }

    public void setLocation(@NotBlank(message = "Must chose event location!") String location) {
        this.location = location;
    }

    public @NotNull @Future(message = "Start date and time must be in the future") LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(@NotNull @Future(message = "Start date and time must be in the future") LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public @NotNull @Future(message = "End date and time must be in the future") LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(@NotNull @Future(message = "End date and time must be in the future") LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    @NotNull
    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(@NotNull int totalTickets) {
        this.totalTickets = totalTickets;
    }

    @NotNull
    public double getPrice() {
        return price;
    }

    public void setPrice(@NotNull double price) {
        this.price = price;
    }

    public @NotBlank(message = "must provide image url") String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(@NotBlank(message = "must provide image url") String imageUrl) {
        this.imageUrl = imageUrl;
    }
}