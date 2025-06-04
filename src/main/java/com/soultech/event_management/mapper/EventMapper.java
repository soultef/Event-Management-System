package com.soultech.event_management.mapper;

import com.soultech.event_management.dto.EventDtoResponse;
import com.soultech.event_management.model.Event;
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


}
