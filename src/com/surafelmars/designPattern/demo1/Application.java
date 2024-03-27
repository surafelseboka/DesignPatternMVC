package com.surafelmars.designPattern.demo1;

import com.surafelmars.designPattern.demo1.controller.Controller;
import com.surafelmars.designPattern.demo1.model.Model;
import com.surafelmars.designPattern.demo1.view.View;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runApp();
            }
        });
    }

    public static void runApp(){
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model,view);

        view.setLoginListener(controller);
    }
}
