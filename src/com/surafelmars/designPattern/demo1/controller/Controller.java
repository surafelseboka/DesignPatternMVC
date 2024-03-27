package com.surafelmars.designPattern.demo1.controller;

import com.surafelmars.designPattern.demo1.model.Model;
import com.surafelmars.designPattern.demo1.view.LoginFormEvent;
import com.surafelmars.designPattern.demo1.view.LoginListener;
import com.surafelmars.designPattern.demo1.view.View;

public class Controller implements LoginListener {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    @Override
    public void loginPerformed(LoginFormEvent loginFormEvent) {
        System.out.println("Login event received Name: " + loginFormEvent.getName() + ", password:  "
                                    + loginFormEvent.getPassword() +
                            " Login Time: " + loginFormEvent.getLocalDateTime());
    }
}
