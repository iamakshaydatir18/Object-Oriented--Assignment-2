package edu.neu.csye6200;

public class AbstractDog extends AbstractAnimalAPI{
	
	public static String Animal= "Animal";
	public String name = "Dog";
	
	
	@Override
	public String toString() {
		return "AbstractDog [Animal="+Animal+", name=" + name + "]";
	}


	@Override
	public void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AbstractAnimalAPI");
		
	}

}
