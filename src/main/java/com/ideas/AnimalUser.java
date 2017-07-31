package com.ideas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalUser {

	public static void main(String[] args) {
		/*Animal animal = new Dog();
		animal.makesound();
		animal = new Cat();
		animal.makesound();
		animal = new Man();
		animal.makesound();*/
	
		Dog animal = new Dog();
		animal.setBreed("labrador");
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Dog dog = (Dog)context.getBean("dog");
		dog.makesound();
		System.out.println(dog.getOwnerInterface().getName());

		/*Animal cat = (Cat)context.getBean("cat");
		cat.makesound();
		Animal man = (Man)context.getBean("man");
		man.makesound();
		*/
	}
}
