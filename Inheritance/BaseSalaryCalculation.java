
public class BaseSalaryCalculation {
	public int salary;
	public int rate;
	
	public BaseSalaryCalculation() {
		
	}
	
	public BaseSalaryCalculation(int salary, int rate) {
		this.salary = salary;
		this.rate = rate;
	}
	
	public void salaryCalculation() {
		this.salary = (this.salary * this.rate) / 20; // fix formul
		System.out.println(this.salary);
	}
	
	
}
