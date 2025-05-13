import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Beyblade Program");
		System.out.println("Press 'q' to exit ");
		
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.println("Which Beyblade do you want to produce?\n"
                    + "1. Dragon\n"
                    + "2. Dranzer\n"
                    + "3. Drayga\n"
                    + "4. Draciel");

			String option = scanner.nextLine();
			
			if (option.equals("q")) {
				System.out.println("Exiting the program");
				break;
			}
			else {
				BeybladeFabric beybladeFabric = new BeybladeFabric();
		
				Beyblade beyblade = beybladeFabric.product_beyblade(option);
				
				if (beyblade == null) {
					System.out.println("Please enter the Valid Beyblade Name...");
				}
				else {
					beyblade.showInfo();
					beyblade.attack();
					beyblade.useHolyBeast();
				}
			}
			
		}
	}

}
