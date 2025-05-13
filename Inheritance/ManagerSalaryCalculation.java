public class ManagerSalaryCalculation extends BaseSalaryCalculation{
	public ManagerSalaryCalculation() {
		super(2000,200);
	}
	public void salaryCalculation() {
		this.salary = (this.salary * this.rate) / 20;
		System.out.println("Manager Salary: "+this.salary);
	}
}
