package Character;
public class Cleric extends Character{

	public Cleric() {
		name = "Name";
		description = "CLERIC";
	}
	
	public double health() {
		return 100;
	}
	
	public double dps() {
		return 25;
	}
	
	public double heals() {
		return 100;
	}
	
	public double defense() {
		return 0;
	}
}
