package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private HouseHold houseHold;

	@Test
	void contextLoads() {
		Person sample1 = houseHold.person();
		Animal pet = houseHold.pet();


		System.out.println("I am samplePerson1: " + sample1.getFirstName());
		System.out.println("I am an empty pet: " + pet.getAnimalName());


	}

}
