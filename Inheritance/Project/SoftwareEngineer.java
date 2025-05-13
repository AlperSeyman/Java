
public class SoftwareEngineer extends Employee{
	
	private String software_languages;
	 
	
	public SoftwareEngineer(String first_name, String last_name, int id,String software_languages) {
		
		super(first_name, last_name, id);
		this.software_languages = software_languages;
	}
	
	public void setSoftwareLanguages(String software_languages) {
		this.software_languages = software_languages;
	}
	public String getSoftwareLanguages() {
		return software_languages;
	}
	
	@Override
	public void show_info() {
		super.show_info();;
		System.out.println("Sofware Engineer Languages: "+ this.getSoftwareLanguages());
	}
	
	
	public void installOS(String os) {
		System.out.println(this.getFirstName() + " is " + " installing " + os);
	}
}
