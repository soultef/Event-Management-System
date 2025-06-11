package com.soultech.event_management.exception.exceptionHandler;

import com.soultech.event_management.exception.CustomException;
import com.soultech.event_management.model.CustomResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomResponse> eventNotFoundException(CustomException exception)
    {
        CustomResponse error = new CustomResponse(
                exception.getStatus().value(),
                exception.getMessage(),
                exception.getErrorCode().toString(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, exception.getStatus());
    }




}
