package com.ideas;

import org.springframework.stereotype.Component;

@Component
public class Owner implements OwnerInterface{

	private String name;

	public String getName() {
		return "Snoopy";
	}

	public void setName(String name) {
		this.name = name;
	}

}
