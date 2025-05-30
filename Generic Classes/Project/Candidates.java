

public abstract class Candidates {
	
	private int calculus;
	private int data_structures;
	private int algorithms;
	private int physics;
	private String name;

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Candidates(int calculus, int data_structures, int algorithms, int physics, String name) {
		
		this.calculus = calculus;
		this.data_structures = data_structures;
		this.algorithms = algorithms;
		this.physics = physics;
		this.name = name;
	}


	public int getCalculus() {
		return calculus;
	}


	public void setCalculus(int calculus) {
		this.calculus = calculus;
	}


	public int getData_structures() {
		return data_structures;
	}


	public void setData_structures(int data_structures) {
		this.data_structures = data_structures;
	}


	public int getAlgorithms() {
		return algorithms;
	}


	public void setAlgorithms(int algorithms) {
		this.algorithms = algorithms;
	}


	public int getPhysics() {
		return physics;
	}


	public void setPhysics(int physics) {
		this.physics = physics;
	}
	
	abstract int calculate_grade();
	
	
}