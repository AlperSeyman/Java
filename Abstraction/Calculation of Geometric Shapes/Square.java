
public class Square extends Shape{
	
	private double side;

	Square(String name, double side) {
		super(name);
		this.side = side;
	}
	
	@Override
	public void calculate_area() {
		
		double area = this.side * this.side;
		System.out.println("Area of " +  getName() +" :" + area);
	}
	
	
	
}
