package com.surafelmars.designPattern.demo1.model;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

class PersonDAOTest {

    @BeforeClass
     void setUpBeforeClass() throws Exception {
        System.out.println("Set up before class");

        Database.getInstance().connect();
    }
    @AfterClass
     void tearDownAfterClass() throws Exception{
        System.out.println("tear down after class");
        Database.getInstance().disconnect();
    }

    @BeforeEach
    void setUp() throws SQLException {
        System.out.println("set up");

        DAOFactory factory = DAOFactory.getFactory(DAOFactory.MYSQL);
        PersonDAO dao = factory.getPersonDAO();
        dao.deleteAll();

    }

    @AfterEach
    void tearDown() {
        System.out.println("tear down");
    }
    @Test
    public void test(){
       int value = 7;
       value += 2;
        System.out.println("Running demo test");
       Assert.assertEquals("Check the code: ", 9, value);

    }

   @Test
    public void testCreate() throws SQLException {
        DAOFactory factory = DAOFactory.getFactory(DAOFactory.MYSQL);
        PersonDAO dao = factory.getPersonDAO();

        Person person1 = new Person("Bob","letmein");
        Person person2 = new Person("Sue", "hello");

        dao.addPerson(person1);
        dao.addPerson(person2);

        List<Person> personList = dao.getPerson();
       Assert.assertEquals("should be two people in the db ", 2, personList.size());

       Assert.assertEquals("These two people should be same  ", person1, personList.get(0));
       Assert.assertEquals("These two people should be same  ", person2, personList.get(1));

       System.out.println("All checked");
    }


}