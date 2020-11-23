package com.epam.jwd.app;

import com.epam.jwd.model.Human;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);


    public static void main(String[] args) {




        LOGGER.info("Application Started");

        Human person1 = new Human("Ivan","Ivanov",50);
        Human person2 = new Human("Mike","Sinica",18);

        int averageAge = person1.getAge() + person2.getAge() >> 1;

        System.out.println(person1.getSurname() + ' ' + person1.getName());
        LOGGER.info("Person1's name is displayed");
        System.out.println(person2.getSurname() + ' ' + person2.getName());
        LOGGER.info("Person2's name is displayed");
        System.out.println("Average age is "+averageAge);
        LOGGER.info("Average age is displayed");



        LOGGER.info("Application Ended");
    }
}
