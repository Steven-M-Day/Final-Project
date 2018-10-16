package Gear;
import Character.Character;

public class Staff extends GearDecorator {

	Character character;
	
	public Staff(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Staff";
	}
	
	public double health() {
		return character.health() + 0;
	}
	
	public double defense() {
		return character.defense() + 0;
	}
	
	public double dps() {
		return character.dps() + 100;
	}
	
	public double heals() {
		return character.heals() + 0;
	}
}
