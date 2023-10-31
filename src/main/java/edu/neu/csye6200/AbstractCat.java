package edu.neu.csye6200;

public class AbstractCat extends AbstractAnimalAPI{
	public static String Animal= "Animal";
	public String name = "Cat";
	
	
	@Override
	public String toString() {
		return "AbstractCat [Animal="+Animal+", name=" + name + "]";
	}


	@Override
	public void Animal() {
		System.out.println(" I am  Animal "+this.name+" from AbstractAnimalAPI");
	}


	
}
