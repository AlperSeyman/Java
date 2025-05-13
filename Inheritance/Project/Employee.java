
public class Employee {
	
	private String first_name;
	private String last_name;
	private int id;
	
	public Employee(String first_name, String last_name, int id) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.id = id;
	}
	
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public String getFirstName() {
		return first_name;
	}
	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public String getLastName() {
		return last_name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void show_info() {
		System.out.println("---- Employee Info ----");
		System.out.println("Name: "+ this.first_name);
		System.out.println("Last Name: "+ this.last_name);
		System.out.println("ID: "+ this.id);
	}
}
