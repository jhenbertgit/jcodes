package com.jhenbert.main;

public class Female extends Human {

	Female(String name, int age) {
		super(name, age);

	}

	@Override
	void speak() {
		System.out.println("I am "+getName()+ " and I am "+getAge()+" years old");
		
		}
	
}

