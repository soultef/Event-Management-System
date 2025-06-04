package com.soultech.event_management.controller;

import com.soultech.event_management.dto.EventDtoResponse;
import com.soultech.event_management.model.Event;
import com.soultech.event_management.service.EventService;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminEventController {


    private EventService eventService;

    public AdminEventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/events")
    public ResponseEntity<Page<EventDtoResponse>> getAllEvents()
    {
       Page<EventDtoResponse> pages =  eventService.getAllEvents();
       return ResponseEntity.ok(pages);

    }



    @GetMapping("/event/{id}")
    public ResponseEntity<EventDtoResponse>getAnEvent(@PathVariable int id)
    {
        return null;
    }

   @PostMapping("/event")
    public ResponseEntity<EventDtoResponse> createEvent(@RequestBody Event event)
    {
        return null;
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
