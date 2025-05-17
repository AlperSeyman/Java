import java.util.Scanner;

public class Passenger implements IAbroadRules{
	
	private int fee;
	private boolean political_ban;
	private boolean visa_status;
	
	public Passenger() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("International Departure Fee : ");
		this.fee = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Do you have a political ban (yes or no) ?  ");
		String answer = scanner.nextLine();
		
		if (answer.equalsIgnoreCase("yes")) {
			this.political_ban = true;
		}
		else if(answer.equalsIgnoreCase("no")) {
			this.political_ban = false;
		}
		else {
			System.out.println("Invalid Answer...");
		}
		
		
		System.out.print("Do you have a visa (yes or no) ?  ");
		String answer2 = scanner.nextLine();
		if (answer2.equalsIgnoreCase("yes")) {
			this.visa_status = true;
		}
		else if(answer2.equalsIgnoreCase("no")) {
			this.visa_status = false;
		}
		else {
			System.out.println("Invalid Answer...");
		}
		
	}
	
	@Override
	public boolean hasPaidFee() {
		
		if (this.fee < 17) {
			System.out.println("Please deposit the departure fee! ");
			return false;
		}
		else {
			System.out.println("The departure fee transaction completed.");
			return true;
		}
	}
	
	@Override
	public boolean isEligible() {
		
		if(this.political_ban == true) {
			System.out.println("You have a political ban!");
			return false;
		}
		else {
			System.out.println("You do not any political ban!");
			return true;
		}
		
	}
	
	@Override
	public boolean checkVisaStatus() {
		
		if(this.visa_status == false) {
			System.out.println("You do not have a visa to enter that country.");
			return false;
		}
		else {
			System.out.println("You have a visa for the country you are going to.");
			return true;
		}
		
	}
}
