package com.soultech.event_management.exception.exceptionHandler;

import com.soultech.event_management.exception.CustomException;
import com.soultech.event_management.model.CustomErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<CustomErrorResponse> eventNotFoundException(CustomException exception)
    {
        CustomErrorResponse error = new CustomErrorResponse(
                exception.getStatus().value(),
                exception.getMessage(),
                exception.getErrorCode().toString(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(error, exception.getStatus());
    }


}
