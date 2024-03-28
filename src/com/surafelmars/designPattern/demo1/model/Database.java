package com.surafelmars.designPattern.demo1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static Database instance = new Database();
    private Connection conn;
    private Database(){}
    public static Database getInstance(){
        return instance;
    }

    public void connect() throws Exception {
        if (conn != null){
            return;
        }try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            throw new Exception("Driver not found");
        }
        String url = "jdbc:mysql://localhost:3307/pattern";
        conn = DriverManager.getConnection(url,"root","root");
    }

    public void disconnect(){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Can't close connection");
            }
        }
        conn = null;
    }

    public Connection getConnection() {
        return conn;
    }
}
