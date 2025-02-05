package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;

public class DeveloperResponse {
    private Developer developer;
    private int status;
    private String message;

    public DeveloperResponse(Developer developer, int status, String message) {
        this.developer = developer;
        this.status = status;
        this.message = message;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
