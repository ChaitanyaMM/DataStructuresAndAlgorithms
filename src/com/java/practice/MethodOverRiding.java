package com.java.practice;

class Animal {
	
	String data() {
		System.out.println("data -parent");

		return "data";
	}

	void eat() {
		System.out.println("eat() method of base class");
		System.out.println("eating.");
	}
	
	static void sample() {
		System.out.println("static method base class");
 	}
}

class Dog extends Animal {

	void eat() {
		System.out.println("eat() method of derived class");
		System.out.println("Dog is eating.");
	}
	
	static void sample() {
		System.out.println("static method derived class");
 	}
	

	String data() {
		super.data();
		System.out.println("data -derived");

		return "data -derived";
	}
	
}

public class MethodOverRiding {

	public static void main(String args[]) {
		Dog d1 = new Dog();
		Animal a1 = new Animal();

		//d1.eat();
		//d1.sample();

		//a1.eat();

		Animal animal = new Dog();
		// eat() method of animal class is overridden by
		// base class eat()
		 animal.eat();
		 animal.sample();
		 animal.data();
	}

}
