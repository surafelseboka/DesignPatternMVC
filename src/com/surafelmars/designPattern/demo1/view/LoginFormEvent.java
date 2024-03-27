package com.surafelmars.designPattern.demo1.view;

import java.time.LocalDateTime;

public class LoginFormEvent {
    private String name;
    private String password;
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
