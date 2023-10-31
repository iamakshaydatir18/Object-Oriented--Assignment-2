package edu.neu.csye6200;

public class ZooAnimals {

	public void Display() {
		
		AnimalAPI animal = new AnimalAPI();
		animal.Animal();
		
		AnimalAPI one = new Cat();
		System.out.println(one.toString());
		one.Animal();
		
		AnimalAPI two = new Dog();
		System.out.println(two.toString());
		two.Animal();
		
		AnimalAPI three = new Lion();
		System.out.println(three.toString());
		three.Animal();
	}
}
