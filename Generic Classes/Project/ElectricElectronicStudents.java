

public class ElectricElectronicStudents extends Candidates{

	public ElectricElectronicStudents(int calculus, int data_structures, int algorithms, int physics, String name) {
		super(calculus,data_structures, algorithms, physics, name);
	}
	
	@Override
	int calculate_grade() {
		
		return  getAlgorithms() * 1 + getCalculus() * 3 + getData_structures() * 2 + getPhysics() * 4 ;
	}
}