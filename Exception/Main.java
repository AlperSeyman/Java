

// Exception = An event that interrupts the normal flow of a program
//			   (Dividing by zero, file not found, mismatch input type)
//             Surround any dangerous code with a ' try{} ' block
//             ' try{}, catch{}, finally{} '

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		

		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("Enter a number : ");
			int number = scanner.nextInt();
			System.out.println(number);
		}
		catch(InputMismatchException e) {
			System.out.println("SHOULD ENTER A NUMBER !!!");
		}
		catch(Exception e){
			// SAFETY NET
			System.out.println("Something went wrong !!!");
		}
		finally {
			System.out.println("This always executes");
		}
		
		
	}

}
