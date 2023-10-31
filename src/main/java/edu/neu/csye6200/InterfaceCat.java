package edu.neu.csye6200;

public class InterfaceCat implements AnimalisticAPI {

	public static String Animal="Animal";
	public String name = "Cat";
	
	@Override
	public void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AnimalisticAPI");
	}

	@Override
	public String toString() {
		return "InterfaceCat [Animal="+Animal+", name=" + name + "]";
	}
	
	

}
