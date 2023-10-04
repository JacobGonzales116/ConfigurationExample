package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AutowireExample {

    /* Since these are annotated as beans in Household configuration class Spring is keeping
       track of them and will look for a bean that will return that type
       when using the Autowired annotation.
    */

    @Autowired
    Person autowiredPerson;

    @Autowired
    Animal autowiredPet;

    @Test
    void testAutowiredCorrectly(){
        System.out.println(autowiredPerson.getFirstName());
        System.out.println(autowiredPet.getAnimalName());
    }
}
