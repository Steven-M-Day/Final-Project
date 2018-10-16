package Character;
public class Mage extends Character{

	public Mage() {
		name = "Name";
		description = "MAGE";
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
