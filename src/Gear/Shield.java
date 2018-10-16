package Gear;
import Character.Character;

public class Shield extends GearDecorator {

	Character character;
	
	public Shield(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Shield";
	}
	
	public double health() {
		return character.health() + 0;
	}
	
	public double defense() {
		return character.defense() + 50;
	}
	
	public double dps() {
		return character.dps() + 0;
	}
	
	public double heals() {
		return character.heals() + 0;
	}
}
