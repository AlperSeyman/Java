
public class Main {

	public static void main(String[] args) {
		
		SoftwareEngineer software_eng = new SoftwareEngineer(false, true);
		
		String[] companies = {"Apple", "Tesla", "Amazon", "Google"};
		
		software_eng.army_status();
		System.out.println(software_eng.gpa(4));
		software_eng.criminal_record();
		software_eng.work_experience(companies);
		software_eng.work();
		
		System.out.println("**************************************");
		
		String[] companies_2 = {"Ford", "Ferrari", "Aston Martin", "Siemens"};
		String[] references = {"Henry Ford","Charles Leclerc", "Lionel Martin", "Robert Bamford", "Ernst Werner Siemens", "Johann Georg Halske"};
		
		MechanicalEngineering mechanical_eng = new MechanicalEngineering(true, false);
		mechanical_eng.army_status();
		System.out.println(mechanical_eng.gpa(3.7));
		mechanical_eng.criminal_record();
		mechanical_eng.work_experience(companies_2);
		mechanical_eng.show_reference(references);
		mechanical_eng.work();
	}

}
