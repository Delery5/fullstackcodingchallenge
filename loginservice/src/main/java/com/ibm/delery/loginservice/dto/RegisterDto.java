package com.ibm.delery.loginservice.dto;

import com.ibm.delery.loginservice.entity.User;

public class RegisterDto {

    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;

    public RegisterDto() {

    }

    public RegisterDto(Long id, String name, String username, String email, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public RegisterDto(User user) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String email() {
        return email;
    }

    public String password(){ return password;}
}

