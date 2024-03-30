package com.surafelmars.designPattern.demo1.model;

public class MySQLDAOFactory extends DAOFactory {

    @Override
    public PersonDAO getPersonDAO() {
        return new MySQLPersonDAO();
    }

    @Override
    public LogDAO getLogDAO() {
        return new MySQLLogDAO();
    }
}
