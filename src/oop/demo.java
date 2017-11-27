package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}

public class demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@email.com";
		person1.phone = "07905139462";
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		
		person2.name = "Sarah";
		person2.sleep();
		
		/*
		// Person
		
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@email.com";
		String phone = "07905139462";
		
		// Action, activities, behaviour
		walking(name);
		//System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		
		// What if we want to do for another person?
		// Attributes, variables, adjectives, descriptors
		String name2 = "Sarah";
		String email2 = "sarah@email.com";
		String phone2 = "08320939462";
		
		// Action, activities, behaviour
		walking(name2);
		//System.out.println(name2 + " is walking");
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
	}
	
	//Enhance by adding functions to minimise code
	
	static void walking (String name) {
		System.out.println(name + " is walking");
		*/
	}
	
}


