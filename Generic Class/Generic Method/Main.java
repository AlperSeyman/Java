
public class Main {

	public static void main(String[] args) {
		
		ComputerScienceStudent css1 = new ComputerScienceStudent(25, 15, 10, 20);
		ComputerScienceStudent css2 = new ComputerScienceStudent(20, 10, 15, 15);
		
		ElectricElectronicStudents ee1 = new ElectricElectronicStudents(10, 20, 15, 25);
		ElectricElectronicStudents ee2 = new ElectricElectronicStudents(15, 25, 20, 10);
		
		
		ComputerScienceStudent c_student = first(css1,css2);
		ElectricElectronicStudents e_student = first(ee1, ee2);
		
		
		System.out.println("Computer Science Student Score : " + c_student.calculate_grade());
		System.out.println("Electric Electronic Student Score : " + e_student.calculate_grade());
	}
	
	public static <E extends Candidates> E first(E e1, E e2) { // Generic Method 
		
		if (e1.calculate_grade() > e2.calculate_grade()) {
			return e1;
		}
		else {
			return e2;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static <E> void print(E[] array) {	// Generic Method
		
		for(E e : array) {
			System.out.println(e);
		}
	}
	*/
}
