package Gear;
import Character.Character;

public class Bow extends GearDecorator {

	Character character;
	
	public Bow(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Bow";
	}
	
	public double health() {
		return character.health() + 0;
	}
	
	public double defense() {
		return character.defense() + 0;
	}
	
	public double dps() {
		return character.dps() + 90;
	}
	
	public double heals() {
		return character.heals() + 0;
	}
}
