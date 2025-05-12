
// Composition = Represents a "part-of" relationship between objects.
//               For example, an Engine is "part of" a Car.
//               Allows complex objects to be constructed from smaller objects.


public class Main {

	public static void main(String[] args) {
		
		
		Car car1 = new Car("Corvette", 2025,"V8");
		
		System.out.println(car1.model);
		System.out.println(car1.year);
		System.out.println(car1.engine.type);
		car1.startCar();

		

	}

}
