package edu.neu.csye6200;

public class ZooAnamalisticAnimals {
	
		public void Display() {
		
		AnimalisticAPI one = new InterfaceCat();
		System.out.println(one.toString());
		one.Animal();
		
		AnimalisticAPI two = new InterfaceDog();
		System.out.println(two.toString());
		two.Animal();
		
		AnimalisticAPI three = new InterfaceLion();
		System.out.println(three.toString());
		three.Animal();
	}
}
