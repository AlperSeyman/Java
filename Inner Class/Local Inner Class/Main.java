

public class Main {

	public static void main(String[] args) {
		
		class Area{ // Local Inner Class
			
			public void areaOfCirle(int radius) {
				
				System.out.println("Area of Cicrle :" + (radius * radius * Math.PI));
			}
		}
		
		Area area = new Area();
		Area area2 = new Area();
		
		area.areaOfCirle(10);
		area2.areaOfCirle(4);
	}

}
