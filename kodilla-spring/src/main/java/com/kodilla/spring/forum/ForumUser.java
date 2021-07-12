package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username;
    private int age;

    public ForumUser() {
        this.username = "John Smith";
        this.age = 20;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}


