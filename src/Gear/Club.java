package Gear;
import Character.Character;

public class Club extends GearDecorator {

	Character character;
	
	public Club(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Club";
	}
	
	public double health() {
		return character.health() + 0;
	}
	
	public double defense() {
		return character.defense() + 0;
	}
	
	public double dps() {
		return character.dps() + 0;
	}
	
	public double heals() {
		return character.heals() + 75;
	}
}
