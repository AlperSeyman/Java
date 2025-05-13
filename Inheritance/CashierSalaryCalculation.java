
public class CashierSalaryCalculation extends BaseSalaryCalculation{
	public CashierSalaryCalculation() {
		super(500,200);
	}
	public void salaryCalculation() {
		this.salary = (this.salary * this.rate) / 20 + 500;
		System.out.println("Cashier Salary: "+this.salary);
	}
}
