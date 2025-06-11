package com.soultech.event_management.mapper;

import com.soultech.event_management.dto.EventDtoRequest;
import com.soultech.event_management.dto.EventDtoResponse;
import com.soultech.event_management.model.Event;
import jakarta.validation.Valid;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public EventDtoResponse allEntityToDto(Event event) {
        return new EventDtoResponse(event.getId(), event.getEventStatus(),
                event.getImageUrl(), event.getAvailableTickets(), event.getPrice(),
                event.getTotalTickets(), event.getEndTime(), event.getStartTime(),
                event.getLocation(), event.getDescription(), event.getTitle(),
                event.getEventId()
                );
    }


    /**
     * Maps fields from an {@link EventDtoRequest} to an existing {@link Event} entity.
     *
     * <p>This method is typically used to update an existing {@code Event} object
     * with new data coming from a request DTO. It copies fields like title, description,
     * start time, price, and ticket information from the DTO to the entity.
     *
     * @param event the existing {@code Event} entity to update (must not be null)
     * @param dto the {@code EventDtoRequest} containing updated event data (must not be null)
     * @return the updated {@code Event} entity
     */
    @Valid
    public Event dtoToEventEntity(Event event, EventDtoRequest dto) {
        event.setTitle(dto.getTitle());
        event.setDescription(dto.getDescription());
        event.setStartTime(dto.getStartDateTime());
        event.setEndTime(dto.getEndDateTime());
        event.setPrice(dto.getPrice());
        event.setImageUrl(dto.getImageUrl());
        event.setTotalTickets(dto.getTotalTickets());
        event.setLocation(dto.getLocation());
        event.setPrice(dto.getPrice());
        return event;
    }


}
