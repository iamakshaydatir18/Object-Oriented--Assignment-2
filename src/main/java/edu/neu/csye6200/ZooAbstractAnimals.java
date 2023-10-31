package edu.neu.csye6200;

public class ZooAbstractAnimals {
	
	public void Display() {
		
		AbstractAnimalAPI one = new AbstractCat();
		System.out.println(one.toString());
		one.Animal();
		
		AbstractAnimalAPI two = new AbstractDog();
		System.out.println(two.toString());
		two.Animal();
		
		AbstractAnimalAPI three = new AbstractLion();
		System.out.println(three.toString());
		three.Animal();
	}
}
