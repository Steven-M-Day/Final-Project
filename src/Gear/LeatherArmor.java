package Gear;
import Character.Character;

public class LeatherArmor extends GearDecorator {

	Character character;
	
	public LeatherArmor(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Leather Armor";
	}
	
	public double health() {
		return character.health() + 20;
	}
	
	public double defense() {
		return character.defense() + 75;
	}
	
	public double dps() {
		return character.dps() + 0;
	}
	
	public double heals() {
		return character.heals() + 0;
	}
}
