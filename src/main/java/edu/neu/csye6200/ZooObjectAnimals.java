package edu.neu.csye6200;

public class ZooObjectAnimals {

	public void start() {
		
		ZooAnimals one = new ZooAnimals();
		one.Display();
		System.out.println();
		ZooAbstractAnimals two = new ZooAbstractAnimals();
		two.Display();
		System.out.println();
		ZooAnamalisticAnimals three = new ZooAnamalisticAnimals();
		three.Display();
	}
}
