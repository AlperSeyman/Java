import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to Maths and Physics Problems");
		
		String problems = "Problems\n"
				+ "1. Area of Circle\n"
				+ "2. Area of Triangle\n"
				+ "3. Inner Product - Vector - Physics\n"
				+ "Exit : q";
		
		while(true) {
			
			System.out.println(problems);
			System.out.print("Select the Operation : ");

			String operation = scanner.nextLine();
			if (operation.equals("q")) {
				System.out.println("The program is terminated..");
				break;
			}
			else if(operation.equals("1")) {
				
				System.out.print("Enter a radius of circle :");
				int radius = scanner.nextInt();
				scanner.nextLine();
				
				Problem.Mathematics.areaOfcircle(radius);
			}
			else if(operation.equals("2")) {
				
				System.out.print("Enter a base of triangle :");
				int base = scanner.nextInt();
				System.out.print("Enter a heigth of triangle :");
				int height = scanner.nextInt();
				scanner.nextLine();
				
				Problem.Mathematics.areaOftriangle(base, height);
			}
			else if(operation.equals("3")) {
				
				Vec vec1 = new Vec("vec1");
				Vec vec2 = new Vec("Vec2");
				Problem.Physics.ınnerProduct(vec1, vec2);
			}
			else {
				System.out.println("Invalid Operations");
			}
			
		}
	}
}
