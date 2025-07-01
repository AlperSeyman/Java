
public class FinalTest {
	
	public final int number_of_object;
	private static int count = 0;
	private final String name;
	
	
	public FinalTest(String name) {
		
		this.name = name;
		
		count++;
		
		number_of_object = count;
		
	}
	
	public String getName() {
		return name;
	}
	
	public static int getCount() {
		return count;
	}
	
	
}
