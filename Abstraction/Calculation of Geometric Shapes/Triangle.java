
public class Triangle extends Shape {
	
	private double height;
	private double base;	
	Triangle(String name, double height, double base) {
		super(name);
		this.height = height;
		this.base = base;
	}
	
	@Override
	public void calculate_area() {
		
		double area = (this.height * this.base) / 2;
		System.out.println("Area of " +  getName() +" :" + area);
	}
	
	
}
