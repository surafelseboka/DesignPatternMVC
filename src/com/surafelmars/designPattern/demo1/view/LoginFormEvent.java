package com.surafelmars.designPattern.demo1.view;

import java.time.LocalDateTime;

public class LoginFormEvent {
    private String name;
    private String password;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private LocalDateTime localDateTime;

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LoginFormEvent(String name, String password) {
        this.name = name;
        this.password = password;
        this.localDateTime = LocalDateTime.now();
    }

    public LoginFormEvent( int id, String name, String password) {
        this.name = name;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
