

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Welcom to Nikola Tesla Airport");
		
		String condition = "Abroads Rules\r\n"
				+ "You must not have any political ban.\r\n"
				+ "You must pay 17€ for departure fee.\r\n"
				+ "You must have a visa.";
		
		String message = "You should complete all condition to travel.";
		
		while(true) {
			
			System.out.println(message);
			System.out.println("*****************************************");
			System.out.println(condition);
			System.out.println("*****************************************");
			
			
			
			Passenger passenger = new Passenger();
			
			System.out.println("Checking the Departure Fee.....");
			Thread.sleep(3000);
			if (passenger.hasPaidFee()== false) {
				continue;
			}
			
			System.out.println("Checking the Political Ban....");
			Thread.sleep(3000);
			if(passenger.isEligible() == false) {
				continue;
			}
			
			System.out.println("Checking the Visa....");
			Thread.sleep(3000);
			if(passenger.checkVisaStatus() == false) {
				continue;
			}
			System.out.println("Your Transaction has been completed. You can travel...");
			break;
		}
	}

}
