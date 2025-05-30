import java.util.Scanner;

public class Mathematics {
	
	private double PI = Math.PI;
	
	public class Factorial{ // Inner Class
		
		
		public void calculate_factorial() { 
			
			Scanner scanner = new Scanner(System.in);	
			System.out.print("Enter a number : ");
			int number = scanner.nextInt();
			
			int result = 1;
			for(int i = 2; i <= number; i++) {
				result = result * i;
			}
			System.out.println(number+ "!: " + result);
		}
	}
	
	public class Prime{ // Inner Class
		
		public boolean prime_number(int number) {
			
			int i = 2;
			while(i < number) {
				if (number % i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}
	}
	
	public class Area{ // Inner Class
		
		public class Circle{ // Inner Class
			
			public void areaOf_circle(int radius) {
				System.out.println("Area of Circle : " + (radius * radius * PI));
			}
		}
			
		
	}
}
