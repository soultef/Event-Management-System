package com.soultech.event_management.model;

import java.time.LocalDateTime;

public class CustomResponse <T>{
    private int status;
    private String message;
    private String statusCode;
    private LocalDateTime timestamp;
    private T object;

    public CustomResponse() {}
    public CustomResponse(int status, String message, String statusCode, LocalDateTime timestamp, T object) {
        this.status = status;
        this.message = message;
        this.statusCode = statusCode;
        this.timestamp = timestamp;
        this.object = object;
    }
    public CustomResponse(int status, String message, String errorCode, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.statusCode = errorCode;
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

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
    public T getObject() {
        return object;
    }
    public void setObject(T object) {
        this.object = object;
    }
}