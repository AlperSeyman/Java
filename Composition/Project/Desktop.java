

public class Desktop {
	
	private String model;
	private String manufacture;
	private String material;
	
	
	public Desktop(String model, String manufacture, String material) {
		this.model = model;
		this.manufacture = manufacture;
		this.material = material;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getManufacture() {
		return manufacture;
	}


	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void start_computer() {
		System.out.println("Computer is starting....");
	}
	
}
