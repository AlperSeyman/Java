
public class ScopeClass2 {
	
	private int privateValue = 30;
	

	public ScopeClass2() {
		System.out.println("privateValue = " + privateValue);
	}
	
	public void InnerScopeControl() {
		
		InnerScope innerScope = new InnerScope();
		System.out.println("a = " + innerScope.a);
	}
	
	public class InnerScope { // Inner Class
		
		private int privateValue = 20;
		int a = 5;
		
		public void multiplyTen() {
			
			int privateValue = 10;
			
			for (int i = 1; i < 6; i++) {
				System.out.println(i + "*" + ScopeClass2.this.privateValue + " = " + (i*  ScopeClass2.this.privateValue));
			}
		} 
	}
}
