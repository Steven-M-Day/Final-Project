package Character;

public abstract class Character {
	
	WeaponBehavior weapon;
	
	String name = "Unknown Player";
	
	String description = "Unknown Player";
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void performFight() {
		FightBehavior.fight();
	}
	
	public abstract double health();
	
	public abstract double dps();
	
	public abstract double heals();
	
	public abstract double defense();
}
