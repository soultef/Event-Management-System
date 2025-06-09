package com.soultech.event_management.controller;

import com.soultech.event_management.dto.EventDtoRequest;
import com.soultech.event_management.dto.EventDtoResponse;
import com.soultech.event_management.model.Event;
import com.soultech.event_management.service.EventService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminEventController {


    private final EventService eventService;

    public AdminEventController(EventService eventService) {
        this.eventService = eventService;
    }

    /**
     * Retrieves a paginated list of all events.
     *  This endpoint fetches all events in a paginated format, using default
     *  page size and sorting (as configured in the service or repository).
     * @return ResponseEntity containing a EventDtoResponse objects with HTTP 200 OK status on success.
     */
    @GetMapping("/events")
    public ResponseEntity<Page<EventDtoResponse>> getAllEvents()
    {
       Page<EventDtoResponse> pages =  eventService.getAllEvents();
       return ResponseEntity.ok(pages);

    }

    /**
     * Retrieves an event by its unique ID.
     * <p>This endpoint handles HTTP GET requests to api/v1/event/{id} and returns
     * the corresponding {@link EventDtoResponse} object.</p>
     *
     * @param id the unique identifier of the event to retrieve
     * @return a {@link ResponseEntity} containing the event data and HTTP 200 OK if found
     * throws exception with HTTP 404 NOT FOUND if the event does not exist
     */

    @GetMapping("/event/{id}")
    public ResponseEntity<EventDtoResponse>getAnEventById(@PathVariable Long id)
    {
        return ResponseEntity.ok(eventService.getAnEvent(id));
    }


    /**
     * Handles HTTP POST requests to create a new event.
     * <p>
     * This endpoint accepts a JSON payload representing event details,
     * validates the input using Jakarta Bean Validation (JSR 380),
     * and delegates the event creation to the {@code eventService}.
     * </p>
     *
     * @param requestDto the {@link EventDtoRequest} containing the event details;
     *                   must be valid according to the validation annotations.
     * @return a {@link ResponseEntity} containing the created event details
     *         as {@link EventDtoRequest} and HTTP status 200 (OK).
     */

   @PostMapping("/event")
    public ResponseEntity<EventDtoRequest> createEvent(@Valid @RequestBody EventDtoRequest requestDto)
    {
        return ResponseEntity.ok(eventService.createAnEvent(requestDto));
    }



    @PostMapping("/event/{id}")
    public ResponseEntity<String> deleteEvent(@PathVariable long id)
    {
        return null;
    }

    @PutMapping("/event/{id}")
    public ResponseEntity<String> updateEvent( @PathVariable int id, @RequestBody Event event)
    {
        return null;
    }

    @PatchMapping("/event")
    public ResponseEntity<String> patchEvent(Event event)
    {
        return null;
    }

    @GetMapping("/event/search/{id}")
    public ResponseEntity<List<EventDtoResponse>> searchAnEvent(@PathVariable int id){
        return null;
    }

}
