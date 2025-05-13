
public class Manager extends Employee{
	
	private int number_of_employee;
	
	public Manager(String first_name, String last_name, int id, int number_of_employee) {
		super(first_name, last_name, id);
		this.number_of_employee = number_of_employee;
	}
	
	public void setNumberOfEmployee(int number_of_employee) {
		this.number_of_employee = number_of_employee;
	}
	public int getNumberOfEmployee() {
		return number_of_employee;
	}

	@Override
	public void show_info() {
		super.show_info();
		System.out.println("Number of employees for which manager is responsible: "+ this.getNumberOfEmployee());
	}
	
	public void raise_salary(int amount) {
		System.out.println(this.getFirstName() + "is making employess " + amount + "raise");
	}
	  
}
