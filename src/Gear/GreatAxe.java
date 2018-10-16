package Gear;
import Character.Character;

public class GreatAxe extends GearDecorator {

	Character character;
	
	public GreatAxe(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Great Axe";
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
