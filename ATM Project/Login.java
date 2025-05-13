import java.util.Scanner;

public class Login {
  
	public boolean log_in(Account account) {
	  
	  Scanner scanner = new Scanner(System.in);
	  String user_name;
	  String password;
	  
	  System.out.println("Username :");
	  user_name = scanner.nextLine();
	  
	  System.out.println("Password: ");
	  password = scanner.nextLine();
	  
	  
	  if(account.getUsername().equals(user_name) && account.getPassword().equals(password)) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
}
