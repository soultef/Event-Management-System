package com.soultech.event_management.model;

import java.time.LocalDateTime;

public class CustomErrorResponse {
    private int status;
    private String message;
    private String errorCode;
    private LocalDateTime timestamp;

    public CustomErrorResponse(int status, String message, String errorCode, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.errorCode = errorCode;
        this.timestamp = timestamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}