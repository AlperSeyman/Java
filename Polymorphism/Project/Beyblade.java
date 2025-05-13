
public class Beyblade {
    private String hero;
    private int spinVelocity;  
    private int attackRate;   

    public Beyblade(String hero, int spinVelocity, int attackRate) {  
        this.hero = hero;
        this.spinVelocity = spinVelocity;
        this.attackRate = attackRate;
    }

    // Getter & Setter for Hero
    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHero() {
        return hero;
    }

    // Getter & Setter for Spin Velocity
    public void setSpinVelocity(int spinVelocity) {
        this.spinVelocity = spinVelocity;
    }

    public int getSpinVelocity() {
        return spinVelocity;
    }

    // Getter & Setter for Attack Rate
    public void setAttackRate(int attackRate) {
        this.attackRate = attackRate;
    }
    public int getAttackRate() {
    	return attackRate;
    }
    
    public void useHolyBeast() {
    	System.out.println(hero + "does not have Holy Beast");
    }
    
    public void attack() {
    	System.out.println(hero + " is attacking with " + attackRate + " power and " + spinVelocity + " spin velocity");
    }
    
    public void showInfo() {
    	System.out.println("------ Beyblade Info ------");
    	System.out.println("Hero Name      :" + getHero());
    	System.out.println("Attack Power   :" + getAttackRate());
    	System.out.println("Spin Veloctiy  :" + getSpinVelocity());
    	
    }
}
