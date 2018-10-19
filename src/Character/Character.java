package Character;

public abstract class Character {
	
	WeaponBehavior weapon;
	
	//String name = "Unknown";
	
	String description = "Unknown Player Description";
/*	
	public String getName() {
		return name;
	}*/
	
	public String getDescription() {
		return description;
	}
	
	public abstract double health();
	
	public abstract double dps();
	
	public abstract double heals();
	
	public abstract double defense();
}
