
public class Audience {
	
	private String name;
	
	private static int numberOf_audience = 0;
	
	
	public Audience(String name) {
		this.name = name;
		numberOf_audience++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int getNumberOf_audience() {
		return numberOf_audience;
	}

	public void watch_play() {
		System.out.println(this.name + " is watching the play");
	}
}
