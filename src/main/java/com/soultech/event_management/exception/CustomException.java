package com.soultech.event_management.exception;

import com.soultech.event_management.enumeration.ErrorCode;
import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {
    private final HttpStatus status;
    private final ErrorCode errorCode;

    public CustomException(String message) {
        super(message);
        this.status = null;
        this.errorCode = null;
    }


    public CustomException(String message, HttpStatus status, ErrorCode errorCode) {
        super(message);
        this.status = status;
        this.errorCode = errorCode;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}

