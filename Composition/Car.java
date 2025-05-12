
public class Car {
	
	String model;
	int year;
	Engine engine;
	
	Car(String model, int year, String engineType){
		this.model = model;
		this.year = year;
		this.engine = new Engine(engineType);
	}
	
	void startCar() {
		this.engine.starEngine();
		System.out.println("The " + this.model + " is running");
	}
}	
