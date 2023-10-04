package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private HouseHold houseHold;

	@Autowired
	private Person sample3;

	@Test
	void contextLoads() {
		Person sample1 = houseHold.person();
		Person sample2 = houseHold.person();
		sample2.setFirstName("Juan");

		Animal pet = houseHold.pet();


		System.out.println("I am samplePerson1: " + sample1.getFirstName());
		System.out.println("I am samplePerson2: " + sample2.getFirstName());
		System.out.println("I am samplePerson3: " + sample3.getFirstName());
		System.out.println("I am an empty pet: " + pet.getAnimalName());
	}

}
