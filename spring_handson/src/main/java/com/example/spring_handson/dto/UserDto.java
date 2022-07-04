package com.example.spring_handson.dto;

import com.example.spring_handson.controller.User;

public class UserDto {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserDto(User user) {
        this.name = user.getName();
    }
}
