package com.soultech.event_management.controller;

import com.soultech.event_management.dto.CreatedResponseEventDto;
import com.soultech.event_management.model.Event;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminEventController {


    @GetMapping
    public ResponseEntity<List <CreatedResponseEventDto>> getAllEvents()
    {
        return null;
    }


    @GetMapping("/event/{id}")
    public ResponseEntity<CreatedResponseEventDto>getAnEvent(@PathVariable int id)
    {
        return null;
    }

   @PostMapping("/event")
    public ResponseEntity<CreatedResponseEventDto> createEvent(@RequestBody Event event)
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
    public ResponseEntity<List<CreatedResponseEventDto>> searchAnEvent(@PathVariable int id){
        return null;
    }

}
