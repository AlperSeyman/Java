public class EngineerSalaryCalculation extends BaseSalaryCalculation{
	public EngineerSalaryCalculation() {
		super(1000,200);
	}
	public void salaryCalculation() {
		this.salary = (this.salary * this.rate)/ 20;
		System.out.println("Engineer Salary: "+ this.salary);
	}
}
