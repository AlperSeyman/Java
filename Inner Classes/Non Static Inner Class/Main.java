import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		Mathematics math = new Mathematics();
		Mathematics.Factorial factorial = math.new Factorial();
		*/

		Mathematics.Factorial factorial = new Mathematics().new Factorial();
		Mathematics.Prime prime = new Mathematics().new Prime();
		Mathematics.Area.Circle area = new Mathematics().new Area().new Circle();
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number to calculate prime number and area of circle: ");
		int number = scanner.nextInt();
		
		if(prime.prime_number(number)) {
			System.out.println("Number is prime.");
		}
		else {
			System.out.println("Number is not prime. ");
		}
		
		factorial.calculate_factorial();
		area.areaOf_circle(number);
	}

}
