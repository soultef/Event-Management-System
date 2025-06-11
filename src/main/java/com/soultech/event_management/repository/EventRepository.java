package com.soultech.event_management.repository;

import com.soultech.event_management.model.Event;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
    // find event by id
    Event getEventById(Long id);
}
