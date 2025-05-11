
// Runtime Polymorphism = When the method that gets executed is decided at
//                        runtime based on the actual type of the object.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Animal animal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What would like to be cat or dog ? (1 = dog, 2 = cat) :");
		
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if(choice == 2) {
			animal = new Cat();
			animal.speak();
		}
	}

}
