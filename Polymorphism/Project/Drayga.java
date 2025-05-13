
public class Drayga extends Beyblade{
	
	private String holyBeast;
	
	public Drayga(String hero, int spinVelocity, int attackRate, String holyBeast) {
		super(hero, spinVelocity, attackRate);
		this.holyBeast = holyBeast;
	}
	
	public void useHolyBeast() {
		System.out.println(this.getHero() + " is using " + holyBeast);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Holy Beast Name :" + holyBeast);
		System.out.println(this.getHero() +"'s attack is : Tiger Claw");
	}

}