import java.util.Scanner;

public class ATM {
	
	public void work(Account account) {
		
		Login login = new Login();

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome Bank");
		System.out.println("****************");
		
		System.out.println("Login");
		System.out.println("****************");
		
		int attempts = 3;
		
		while (true) {
			if (login.log_in(account)) {
				System.out.println("Login is successful...");
				break;
			}
			else {
				System.out.println("Login is fail...");
				attempts = attempts -1 ;
				System.out.println("Remaining Attempts: "+attempts);
				System.out.println("Please Try Again");
			}
			if (attempts == 0) {
				System.out.println("You have run out of attemps");
				
				return;
			}
		}
		System.out.println("****************");
		String transactions = "1. Balance\n 2. Deposit\n 3.Withdraw\n Exit: q "; 
		System.out.println(transactions);
		System.out.println("****************");
		
		
		while(true) {
			String transaction = scanner.nextLine();
			
			if(transaction.equals("q")) {
				break;
			}
			else if(transaction.equals("1")){
				System.out.println("Balance : "+ account.getBalance()); 
			}
			else if(transaction.equals("2")) {
				System.out.println("Please Enter Ammount: ");
				int amount = scanner.nextInt();
				scanner.nextLine();
				account.deposit(amount);
			}
			else if(transaction.equals("3")) {
				System.out.println("Please Enter Ammount: ");
				int amount = scanner.nextInt();
				scanner.nextLine();
				account.withdraw(amount);
			}
			else {
				System.out.println("....Invalid Transaction...");
			}
			
		}
		
	}
}
