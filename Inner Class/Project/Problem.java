
public class Problem {
	
	public static class Mathematics{ // Static Inner Class 
		
		public static void areaOfcircle(int radius){ // Static Method
			System.out.println("Area of Circle :" + (radius * radius * Math.PI));
		}
		
		public static void areaOftriangle(int base, int height) { // Static Method
			System.out.println("Area of Triangle : " + ((base * height) / 2));
		}
	}
	
	public static class Physics{ // Static Inner Class
		
		public static void ınnerProduct(Vec vec1, Vec vec2) {
			
			int inner_product = (vec1.getI() * vec2.getI()) + (vec1.getJ() * vec2.getJ()) + (vec1.getK() * vec2.getK());
			
			System.out.println(vec1.getName()+  " and " + vec2.getName() + "are inner product : "+inner_product);
		}
	}
	
}
