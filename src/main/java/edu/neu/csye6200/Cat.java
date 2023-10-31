package edu.neu.csye6200;

public class Cat extends AnimalAPI {
	
	public static String Animal= "Animal";
	public String name = "Cat";
	
	@Override
	protected void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AnimalAPI");
	
	}
	
	@Override
	public String toString() {
		return "Cat [Animal="+Animal+", name=" + name + "]";
	}
}
