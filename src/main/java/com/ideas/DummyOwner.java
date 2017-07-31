package com.ideas;

import org.springframework.stereotype.Component;

@Component
public class DummyOwner implements OwnerInterface {
	
	public String getName(){
		return "Dummyowner";
	}
}
