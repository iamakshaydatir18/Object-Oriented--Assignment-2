package edu.neu.csye6200;

public class AbstractLion extends AbstractAnimalAPI {
	public static String Animal= "Animal";
	public String name = "Lion";
	
	
	@Override
	public String toString() {
		return "AbstractLion [Animal="+Animal+", name=" + name + "]";
	}


	@Override
	public void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AbstractAnimalAPI");
	}

}
