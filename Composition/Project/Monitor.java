

public class Monitor {
	
	private String model;
	private String manufacture;
	private String inch;
	private Resolution resolution;
	
	public Monitor(String model, String manufacture, String inch, Resolution resolution) {
		this.model = model;
		this.manufacture = manufacture;
		this.inch = inch;
		this.resolution = resolution;
		
	}
	
	public void setModel(String model) {
		this.model = model;	
	}
	 public String getModel() {
		 return model;
	 }
	 
	 public void setMnufacture(String manufacture) {
		 this.manufacture = manufacture;
	 }
	 public String getManufacture() {
		 return manufacture;
	 }
	 
	 public void setInch(String inch) {
		 this.inch = inch;
	 }
	 
	 public String getInch() {
		 return inch;
	 }
	 
	 public void setResolution(Resolution resolution) {
		 this.resolution = resolution;
	 }
	 public Resolution getResolution() {
		 return resolution;
	 }
	 
	 public void turn_off_monitor() {
		 System.out.println("Monitor is turning off...");
	 }

	 
}
