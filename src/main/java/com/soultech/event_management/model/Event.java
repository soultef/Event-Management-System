package com.soultech.event_management.model;

import com.soultech.event_management.enumeration.EventStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;


@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String eventId;

    @NotBlank(message = "Event name must not be blank")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Event description must not be blank")
    @Column(nullable = false)
    private String description;

    @NotBlank(message = "Event location must not be blank")
    @Column(nullable = false)
    private String location;

    @NotNull(message = "Event start time must not be null")
    @Future(message = "Start time must be in the future")
    @Column(nullable = false)
    private LocalDateTime startTime;

    @NotNull(message = "Event end time must not be null")
    @Future(message = "End time must be in the future")
    @Column(nullable = false)
    private LocalDateTime endTime;

    @NotNull(message = "Number of Tickets must not be null")
    @Min(value = 100, message = "Number of ticket must be at least 100")
    @Column(nullable = false)
    private int totalTickets;

    @Column(nullable = false)
    private int availableTickets;

    @NotNull(message = "Price must not be null")
    @Min(value = 1, message = "Price must be at least 1")
    @Column(nullable = false)
    private double price;

    @NotBlank(message = "Image URL must not be blank")
    @Column(nullable = false)
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EventStatus eventStatus;


    public Event() {
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public  LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime( LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public  LocalDateTime getEndTime() {
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

    public void setPrice( double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public EventStatus getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(EventStatus eventStatus) {
        this.eventStatus = eventStatus;
    }
}