

public class Motherboard {
	
	private String model;
	private String manufacture;
	private int number_of_slot;
	private String processor;
	
	public Motherboard(String model, String manufacture, int number_of_slot, String processor) {
		this.model = model;
		this.manufacture = manufacture;
		this.number_of_slot = number_of_slot;
		this.processor = processor;
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

	public int getNumber_of_slot() {
		return number_of_slot;
	}

	public void setNumber_of_slot(int number_of_slot) {
		this.number_of_slot = number_of_slot;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void install_os(String os) {
		this.processor = os;
		System.out.println("Operation System is installed : " + os);
	}
	
	
	
	
}
