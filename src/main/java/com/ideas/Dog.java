package com.ideas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {

	private String breed;
	@Autowired
	@Qualifier("dummyOwner")
	private OwnerInterface ownerInterface;
	
	public OwnerInterface getOwnerInterface() {
		return ownerInterface;
	}
	public void setOwnerInterface(OwnerInterface ownerInterface) {
		this.ownerInterface = ownerInterface;
	}
	/*private Owner owner;
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}*/
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void makesound() {
		System.out.println("Bark : of breed " + this.breed);
	}
	
	

}
