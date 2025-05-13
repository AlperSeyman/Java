import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome Employee Program....");
		
		String operators = "Operators....\n"
				+ "1. Sofware Engineer Transaction\n"
				+ "2. Manager Transaction\n"
				+ "For exit press 'q' ";
		
		System.out.println("*****************************");
		System.out.println(operators);
		System.out.println("*****************************");
		
		while (true) {
			

			System.out.print("Please Select Transaction : ");
			String transaction = scanner.nextLine();
			
			if(transaction.equals("q")) {
				System.out.println("Exiting Program...");
				break;
			}
			else if(transaction.equals("1")){
				
				SoftwareEngineer soft_eng = new SoftwareEngineer("Alice","Universe" , 571,"Assembly, C/C++, Java, PHP, Pascal");
				String software_op = "1. Install OS\n"
						+ "2. Show Info\n"
						+ "For exit press 'q' ";
				System.out.println(software_op);
				
				while(true) {
					
					System.out.print("Please Select Software Engineer Transaction : ");
					String software_transaction = scanner.nextLine();
					
					
					if (software_transaction.equals("q")) {
						System.out.println("Exiting Software Engineer Transaction...");
						break;
					}
					else if(software_transaction.equals("1")) {
						System.out.print("Select OS : ");
						String os = scanner.nextLine();
						soft_eng.installOS(os);
					}
					else if(software_transaction.equals("2")) {
						soft_eng.show_info();
					}
					else {
						System.out.println("Invalid Transaction");
					}
					
				}
				
			}
			else if(transaction.equals("2")){
				
				Manager manager = new Manager("Bob", "Space", 171, 14);
				
				String manager_op =  "1. Raise Salary\n"
						+ "2. Show Info\n"
						+ "For exit press 'q' ";
				System.out.println(manager_op);
				
				while(true) {
					System.out.print("Please Select Manager Transaction : ");
					String manager_transaction = scanner.nextLine();
					
					
					if (manager_transaction.equals("q")) {
						System.out.println("Exiting Manager Transaction...");
						break;
					}
					else if(manager_transaction.equals("1")) {
						System.out.print("How much of raise do you want the manager to give : ");
						int amount = scanner.nextInt();
						scanner.nextLine();
						manager.raise_salary(amount);
					}
					else if(manager_transaction.equals("2")) {
						manager.show_info();
					}
					else {
						System.out.println("Invalid Transaction");
					}
				}
				
			}
			else {
				System.out.println("Invalid Transaction");
			}
			
		}
				

	}

}
