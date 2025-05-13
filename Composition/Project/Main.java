
public class Main {

	public static void main(String[] args) {
		
		Resolution resolution = new Resolution(1920, 1080);
		Monitor monitor = new Monitor("abdax", "absbd", "24", resolution);
		
		Desktop desktop = new Desktop("abdas", "abdasd", "absdb glass");
		
		Motherboard motherboard = new Motherboard("adadad", "adbad", 5, "Windows 11");
		
		Computer computer = new Computer(motherboard, desktop, monitor);
		
		
		computer.getDesktop().start_computer();
		computer.getMotherboard().install_os("Ubuntu");
		
		
	}

}
