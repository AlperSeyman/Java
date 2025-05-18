
public class Main {

	public static void main(String[] args) {
		
		SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
		
		User user1 = new User("Tesla", 1, 20);
	
		signUpManager.signUp(user1);

	}

}
