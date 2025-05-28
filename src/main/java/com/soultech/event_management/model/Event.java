package com.soultech.event_management.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;


@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_seq")
    private Long id;

    @Column(nullable = false)
    @NotBlank(message = "Event name must not be blank")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Event description must not be blank")
    private String description;

    @Column(nullable = false)
    @NotBlank(message = "Event location must not be blank")
    private String location;


    @Column(nullable = false)
    @NotBlank(message = "Event start time must not be blank")
    private LocalDateTime startTime;

    @Column(nullable = false)
    @NotBlank(message = "Event end time must not be blank")
    private LocalDateTime endTime;

    @Column(nullable = false)
    @NotNull(message = "Number of Tickets must not be null")
    @Min(value = 100, message = "Number of ticket must be at least 100")
    private int totalTickets;

    @Column(nullable = false)
    private int availableTickets;

    @Column(nullable = false)
    @NotNull(message = "Price must not be null")
    @Min(value = 1, message = "Price must not be zero or less")
    private double price;

    @Column(nullable = false)
    private String imageUrl;



    public Event() {}

    public Event(String title, String description, String location, LocalDateTime startTime,
                 LocalDateTime endTime, int totalTickets, double price, String imageUrl) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.startTime = startTime;
        this.endTime = endTime;
        this.totalTickets = totalTickets;
        this.availableTickets = totalTickets;
        this.price = price;
        this.imageUrl = imageUrl;
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

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
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
