
public class Main {

	public static void main(String[] args) {
		
		BaseSalaryCalculation baseSalaryCalculation = new ManagerSalaryCalculation();
		baseSalaryCalculation.salaryCalculation();
		
		EngineerSalaryCalculation engineerSalaryCalculation = new EngineerSalaryCalculation();
		engineerSalaryCalculation.salaryCalculation();
		
		
		ManagerSalaryCalculation managerSalaryCalculation = new ManagerSalaryCalculation();
		managerSalaryCalculation.salaryCalculation();
		
		
		CashierSalaryCalculation cashierSalaryCalculation = new CashierSalaryCalculation();
		cashierSalaryCalculation.salaryCalculation();
	}

}
