package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {

    private String user;

    public ForumUser() {
        this.user = "John Smith";
    }

    public String getUser() {
        return user;
    }
}

