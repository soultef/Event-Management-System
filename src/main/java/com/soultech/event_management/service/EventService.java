package com.soultech.event_management.service;

import com.soultech.event_management.dto.EventDtoRequest;
import com.soultech.event_management.dto.EventDtoResponse;
import com.soultech.event_management.enumeration.ErrorCode;
import com.soultech.event_management.enumeration.EventStatus;
import com.soultech.event_management.exception.CustomException;
import com.soultech.event_management.mapper.EventMapper;
import com.soultech.event_management.model.Event;
import com.soultech.event_management.repository.EventRepository;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EventService {

    private final EventRepository eventRepository;
    private final EventMapper eventMapper;


    @Autowired
    public EventService(EventRepository eventRepository, EventMapper eventMapper) {
        this.eventRepository = eventRepository;
        this.eventMapper = eventMapper;
    }


    public Page<EventDtoResponse> getAllEvents()
    {
        Page<Event> events = eventRepository.findAll(PageRequest.of(0, 10));
         return events.map(eventMapper::allEntityToDto);

    }

    public EventDtoResponse getAnEvent(long id) throws CustomException {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new CustomException("No event under id " + id,
                        HttpStatus.NOT_FOUND, ErrorCode.EVENT_NOT_FOUND));
        return eventMapper.allEntityToDto(event);
    }


    public EventDtoRequest createAnEvent(EventDtoRequest eventDtoRequest) {
        try{
            Event events = new Event();
            String anEventId = "EMS-" + System.currentTimeMillis() + "-"+ UUID.randomUUID().toString().substring(0, 8);
            events.setEventId(anEventId);

            events.setAvailableTickets(eventDtoRequest.getTotalTickets());
            events.setEventStatus(EventStatus.ACTIVE);
            Event persistEvent = eventMapper.dtoToEventEntity(events, eventDtoRequest);


            eventRepository.save(persistEvent);
            return eventDtoRequest;
        }
        catch (DataIntegrityViolationException | ConstraintViolationException exception)
         {
            throw new CustomException("Event creation failed due to invalid or duplicate data.",
                    HttpStatus.BAD_REQUEST, ErrorCode.DUPLICATE_EVENT);
         }
        catch (Exception exception)
        {
            throw new CustomException("Unexpected error occurred while creating the event.",
                    HttpStatus.INTERNAL_SERVER_ERROR, ErrorCode.UNEXPECTED_ERROR);
         }

    }


    public void deleteEvent(long id) {
        if(!eventRepository.existsById(id))
            throw new CustomException("No event is registered under this id",
                    HttpStatus.NOT_FOUND, ErrorCode.EVENT_NOT_FOUND);

         eventRepository.deleteById(id);

    }

    public EventDtoResponse updateEvent(Long id, @Valid EventDtoRequest updatedEvent) {
        if(!eventRepository.existsById(id))
            throw new CustomException("No event is registered under this id",
                    HttpStatus.NOT_FOUND, ErrorCode.EVENT_NOT_FOUND);
        Event anEvent = eventRepository.getEventById(id);
        eventRepository.save(eventMapper.dtoToEventEntity(anEvent, updatedEvent));
        return eventMapper.allEntityToDto(anEvent);

    }

    public List<EventDtoResponse> searchEvent(String search) {
        return null;
    }
}
