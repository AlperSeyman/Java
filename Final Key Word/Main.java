
public class Main {

	public static void main(String[] args) {
		
		
		FinalTest finalTest1 = new FinalTest("Object1");
		FinalTest finalTest2 = new FinalTest("Object2");
		
		
		Database db = new Database();
		
		System.out.println("Database Name :" + db.databaseName);
		System.out.println(db.username);
		System.out.println(db.password);
		
	}

}
