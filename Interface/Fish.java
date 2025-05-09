
public class Fish implements Prey, Predator{
	
	@Override
	public void flee() {
		System.out.println("The Fish is swimming away");
	}
	
	@Override
	public void hunt() {
		System.out.println("The Fhis is hunting");
	}
}
