package edu.neu.csye6200;

public class Dog extends AnimalAPI{
	
	public static String Animal= "Animal";
	public String name = "Dog";
	
	@Override
	protected void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AnimalAPI");
	
	}
	
	@Override
	public String toString() {
		return "Dog [Animal="+Animal+", name=" + name + "]";
	}

}
