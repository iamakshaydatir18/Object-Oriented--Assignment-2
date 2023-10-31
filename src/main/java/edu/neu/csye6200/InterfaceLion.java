package edu.neu.csye6200;

public class InterfaceLion implements AnimalisticAPI {
	public static String Animal="Animal";
	public String name = "Lion";
	
	@Override
	public void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AnimalisticAPI");
	}

	@Override
	public String toString() {
		return "InterfaceLion [Animal="+Animal+", name=" + name + "]";
	}
	
	
}
