package com.surafelmars.designPattern.demo1.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
s
import static org.junit.jupiter.api.Assertions.*;

class PersonDAOTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test(){
         int value = 7;
         value -=2;

          Assert.assertEquals("Check that the arthimetic works in java" ,5, value);
    }
}

