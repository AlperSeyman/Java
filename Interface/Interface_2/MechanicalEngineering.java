
public class MechanicalEngineering implements IEngineer, IWork{
	
	private Boolean army;
	private Boolean criminal;
	
	 public MechanicalEngineering(Boolean army, Boolean criminal) {
		this.army = army;
		this.criminal = criminal;

	}
	
	@Override
	public void army_status() {
		
		if (this.army) {
			System.out.println("Served in the army");
		}else {
			System.out.println("Did not serve in the amry or status unknown");
		}
	}
	
	@Override
	public String gpa(double degree) {
		return "GPA : " + degree;
	}
	
	@Override
	public void criminal_record() {
		
		if(this.criminal) {
			System.out.println("Have a criminal record");
		}else {
			System.out.println("Don't have any criminal record");
		}
	}
	
	public void work_experience(String[] companies) {
		
		if (companies.length == 0) {
			System.out.println("Don't have any work experience");
		}else {
			System.out.println("Worked as a Software Engineer in these companies: ");
			for(String company : companies) {
				System.out.println(company);
			}
		}
	}
	
	public void show_reference(String[] references) {
		
		if(references.length == 0) {
			System.out.println("Don't have any work experience");
		}else {
			System.out.println("References: ");
			for(String reference : references) {
				System.out.println(reference);
			}
		}
		
	}
	
	@Override
	public void work() {
		System.out.println("Mechanical Engineering is working....");
	}
}
