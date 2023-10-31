package edu.neu.csye6200;

public class Lion extends AnimalAPI {
	
	public static String Animal= "Animal";
	public String name = "Lion";

	
	@Override
	protected void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AnimalAPI");
	
	}

	@Override
	public String toString() {
		return "Lion [Animal="+Animal+", name=" + name + "]";
	}
	
}
