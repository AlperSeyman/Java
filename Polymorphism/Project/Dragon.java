
public class Dragon extends Beyblade{
	
	private String holyBeast;
	private String secretTalent;
	
	public Dragon(String hero, int spinVelocity, int attackRate, String holyBeast, String secretTalent) {
		super(hero, spinVelocity, attackRate);
		this.holyBeast = holyBeast;
		this.secretTalent = secretTalent;
	}
	
	public void useHolyBeast() {
		System.out.println(this.getHero() + " is using  " + holyBeast);
		System.out.println("Secret Talent : " + secretTalent);
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Holy Beast Name :" + holyBeast);
		System.out.println(this.getHero() +"'s attack is : Ghost Hurricane");
	}

}
