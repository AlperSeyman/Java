
public class BeybladeFabric {
	
	public Beyblade product_beyblade(String beyblade_type){
		
		if (beyblade_type.equals("Dragon")) {
			return new Dragon("Takao", 800, 300, "Blue Dragon", "Speking with Dragon");
			
		}
		else if (beyblade_type.equals("Dranzer")){
			return new Dranzer("Kai", 600, 400, "Red Phoenix");
		}
		else if (beyblade_type.equals("Drayga")){
			return new Dranzer("Rei", 800, 250, "White Tiger");
		}
		else if (beyblade_type.equals("Draciel")){
			return new Dranzer("Max", 400, 1000, "Dark Turtle");
		}
		else {
			return null;
		}
		
	}
}
