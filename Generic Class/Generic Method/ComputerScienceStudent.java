
public class ComputerScienceStudent extends Candidates{
	
	public ComputerScienceStudent(int calculus, int data_structures, int algorithms, int physics) {
		super(calculus, data_structures, algorithms, physics);
	}
	
	@Override
	int calculate_grade() {
		
		return  getAlgorithms() * 3 + getCalculus() * 2 + getData_structures() * 5 + getPhysics() * 1 ;
	}
}
