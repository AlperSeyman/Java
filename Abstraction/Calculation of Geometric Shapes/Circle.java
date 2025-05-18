
public class Circle extends Shape{
	
	private double radius;
	
	Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public void calculate_area() {
		
		double area = Math.PI * this.radius * this.radius;
		System.out.println("Area of " +  getName() +" :" + area);
			
	}
}
