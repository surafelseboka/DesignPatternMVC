package com.surafelmars.designPattern.demo1.model;

import java.util.List;

public interface LogDAO {
    void addEntry(Log log);

    List<Log> getEntries(int number);
}
