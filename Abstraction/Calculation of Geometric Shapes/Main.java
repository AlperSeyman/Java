import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String calculations = "Calculations\r\n"
				+ "1 - Square\r\n"
				+ "2 - Circle\r\n"
				+ "3 - Triangle\r\n"
				+ "Exit : q ";
		
		while(true) {
			
			System.out.println(calculations);
			System.out.print("Which shape would you like to calculate ? : ");
			
			String shape_type = scanner.nextLine();
			
			Shape shape = null;
			
			if (shape_type.equals("q")) {
				
				System.out.println("The programme has been terminated.");
				break;
			}
			else if(shape_type.equals("1")){
				
				System.out.print("Square Side Length : ");
				double side = scanner.nextDouble();
				scanner.nextLine();
				
				shape = new Square("Square", side);
				shape.calculate_area();
			}
			else if(shape_type.equals("2")) {
				
				System.out.print("Circle Radius : ");
				double radius = scanner.nextDouble();
				scanner.nextLine();
				
				shape = new Circle("Circle", radius);
				shape.calculate_area();
			}
			else if(shape_type.equals("3")) {
				
				System.out.print("Triangle Base : ");
				double base = scanner.nextDouble();
				System.out.print("Triangle Height : ");
				double height = scanner.nextDouble();
				scanner.nextLine();;
				
				shape = new Triangle("Triangle", height, base);
				shape.calculate_area();
			}
			else {
				System.out.println("Invalid Transaction");
			}
		}
	}		
}
