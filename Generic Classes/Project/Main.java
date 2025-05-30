import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Finding The Best Student");
		
		Scanner scanner = new Scanner(System.in);
		
		String options = "1. Computer Science Department\n"
				+ "2. Electric & Electronic Department\n"
				+ "Exit : q ";
		
		
		System.out.println("*******************************");
		
		
		while (true) {
			
			System.out.println(options);
			
			System.out.print("Ente a procedure: ");
			String option = scanner.nextLine();
			
			if(option.equals("q")) {
				System.out.println("The Program is terminating...");
				break;
			}
			else if (option.equals("1")) {
				
				ComputerScienceStudent[] students = new ComputerScienceStudent[3];
				
				for (int i=0; i< 3; i++) {
					System.out.print("Student Name : ");
					String name =  scanner.nextLine();
					System.out.print("Enter a calculus grade : ");
					int calculus = scanner.nextInt();
					System.out.print("Enter a  data structure grade : ");
					int data_structures = scanner.nextInt();
					System.out.print("Enter a algorithms grade : ");
					int algorithms = scanner.nextInt();
					System.out.print("Enter a physics grade : ");
					int physics = scanner.nextInt();
					
					scanner.nextLine();
					
					students[i] = new ComputerScienceStudent(calculus, data_structures, algorithms, physics, name);
				}
				
				
				ComputerScienceStudent c_student = first_student(students[0], students[1], students[2]);
				System.out.println("The Best Student : " + c_student.getName());
				System.out.println("Greade of Student :" + c_student.calculate_grade());
				
			}
			else if (option.equals("2")) {
				
				ElectricElectronicStudents[] students = new ElectricElectronicStudents[3];
				
				for (int i=0; i< 3; i++) {
					System.out.print("Student Name : ");
					String name =  scanner.nextLine();
					System.out.print("Enter a calculus grade : ");
					int calculus = scanner.nextInt();
					System.out.print("Enter a  data structure grade : ");
					int data_structures = scanner.nextInt();
					System.out.print("Enter a algorithms grade : ");
					int algorithms = scanner.nextInt();
					System.out.print("Enter a physics grade : ");
					int physics = scanner.nextInt();
					
					scanner.nextLine();
					
					students[i] = new ElectricElectronicStudents(calculus, data_structures, algorithms, physics, name);
				}
				
				ElectricElectronicStudents e_student = first_student(students[0], students[1], students[2]);
				System.out.println("The Best Student : " + e_student.getName());
				System.out.println("The Best Student : " + e_student.calculate_grade());
				
			}
			else {
				System.out.println("Invalid Operation...");
			}
		}
		
		
		
		
	}	
	
	public static <E extends Candidates> E first_student(E e1, E e2, E e3) {
		
		if (e1.calculate_grade() > e2.calculate_grade() && e1.calculate_grade() > e3.calculate_grade()) {
			return e1;
		}
		else if (e2.calculate_grade() > e1.calculate_grade() && e2.calculate_grade() > e3.calculate_grade()) {
			return e2;
		}
		else if (e3.calculate_grade() > e1.calculate_grade() && e3.calculate_grade() > e2.calculate_grade()) {
			return e3;
		}
		else {
			return e1;
		}
		
	}
}
