import javax.print.attribute.standard.Destination;

public class Computer {
	
	private Motherboard motherboard;
	private Desktop desktop;
	private Monitor monitor;
	
	public Computer(Motherboard motherboard, Desktop desktop, Monitor monitor) {
		this.motherboard = motherboard;
		this.desktop = desktop;
		this.monitor = monitor;
	}
	
	public void setMotherboard(Motherboard motherboard) {
		this.motherboard = motherboard;
	}
	public Motherboard getMotherboard() {
		return motherboard;
	}
	
	public void setDesktop(Desktop desktop) {
		this.desktop = desktop;
	}
	public Desktop getDesktop() {
		return desktop;
	}
	
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Monitor getMonitor() {
		return monitor;
	}
}
