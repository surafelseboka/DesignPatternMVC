package com.surafelmars.designPattern.demo1.controller;

import com.surafelmars.designPattern.demo1.model.Database;
import com.surafelmars.designPattern.demo1.model.Model;
import com.surafelmars.designPattern.demo1.model.Person;
import com.surafelmars.designPattern.demo1.view.*;

import java.sql.SQLException;
import java.util.List;


public class Controller implements CreateUserListener, SaveListener,
        AppListener {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void onUserCreated(CreateUserEvent event) {
        model.addPerson(new Person(event.getName(), event.getPassword()));
    }

    @Override
    public void onSave() {
        try {
            model.save();
        } catch (Exception e) {
            view.showError("Error saving to database.");
        }
    }

    @Override
    public void onOpen() {
        try {
            Database.getInstance().connect();
        } catch (Exception e) {
            view.showError("Cannot connect to database.");
        }

        try {
            model.load();
        } catch (Exception e) {
            view.showError("Error loading data from database.");
        }
    }

    @Override
    public void onClose() {
        Database.getInstance().disconnect();
    }

}