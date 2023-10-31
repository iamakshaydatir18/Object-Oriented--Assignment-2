package edu.neu.csye6200;

public class InterfaceDog implements AnimalisticAPI{
	
	public static String Animal="Animal";
	public String name = "Dog";
	

	@Override
	public void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AnimalisticAPI");
	}


	@Override
	public String toString() {
		return "InterfaceDog [Animal="+Animal+", name=" + name + "]";
	}
	
	
	
}
