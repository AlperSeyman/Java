
public class Mathematics {
	
	private static double PI = Math.PI;
	
	public static class Area{ // Static Inner Class
		
		public static void areaOf_circle(int radius) {
			System.out.println("Area of Circle :" + (radius * radius * PI));
		}
	}
}
