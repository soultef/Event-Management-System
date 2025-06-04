package com.soultech.event_management.service;

import com.soultech.event_management.dto.EventDtoResponse;
import com.soultech.event_management.mapper.EventMapper;
import com.soultech.event_management.model.Event;
import com.soultech.event_management.repository.EventRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final EventMapper eventMapper;

    public EventService(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }


    public Page<EventDtoResponse> getAllEvents()
    {
        Page<Event> events = eventRepository.findAll(PageRequest.of(0, 10));
         return events.map(eventMapper::allEntityToDto);

    }


}
