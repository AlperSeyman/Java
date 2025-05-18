
public class SignUpManager {
	
	private IUserCheckService iUserCheckService;
	
	public SignUpManager(IUserCheckService iUserCheckService) {
		this.iUserCheckService = iUserCheckService;
	}
	
	public void signUp(User user) {
		
		if(this.iUserCheckService.checkUser(user)) {
			System.out.println("User Registered : " + user.getName());
		}
		else {
			System.out.println("User failed to register!");
		}
		
			
	}
	
}
