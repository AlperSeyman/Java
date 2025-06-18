
public class ScopeClass {
	
	private int privateValue = 30;
	
	public ScopeClass() {
		System.out.println("privateValue = " + privateValue);
	}
	
	public void multiplyTen() {
		int privateValue = 10;
		
		for (int i = 1; i < 6; i++) {
			System.out.println(i + "*" + this.privateValue + " = " + (i*  this.privateValue));
		}
	}
}
