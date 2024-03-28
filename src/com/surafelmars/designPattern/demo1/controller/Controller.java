package com.surafelmars.designPattern.demo1.controller;

import com.surafelmars.designPattern.demo1.model.DAOFactory;
import com.surafelmars.designPattern.demo1.model.Model;
import com.surafelmars.designPattern.demo1.model.Person;
import com.surafelmars.designPattern.demo1.model.PersonDAO;
import com.surafelmars.designPattern.demo1.view.LoginFormEvent;
import com.surafelmars.designPattern.demo1.view.LoginListener;
import com.surafelmars.designPattern.demo1.view.View;

import java.sql.SQLException;

public class Controller implements LoginListener {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    private PersonDAO personDAO = DAOFactory.getPersonDAO();

    @Override
    public void loginPerformed(LoginFormEvent event) {
        System.out.println("Login event received Name: " + event.getName() + ", password:  "
                                    + event.getPassword() +
                            " Login Time: " + event.getLocalDateTime());

        try {
            personDAO.addPerson(new Person(1, event.getName(), event.getPassword()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
