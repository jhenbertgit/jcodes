package com.jhenbert.main;

public abstract class Human {
	
	private String name;
	private int age;
	
	Human(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	abstract void speak();
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
}
