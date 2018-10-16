package Character;
public class Warrior extends Character{
	
	public Warrior() {
		name = "Name";
		description = "WARRIOR";
	}
	
	public double health() {
		return 100;
	}
	
	public double dps() {
		return 100;
	}
	
	public double heals() {
		return 0;
	}
	
	public double defense() {
		return 0;
	}
}

