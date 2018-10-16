package Gear;
import Character.Character;

public class Sword extends GearDecorator{

	Character character;
	
	public Sword(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Sword";
	}
	
	public double health() {
		return character.health() + 0;
	}
	
	public double defense() {
		return character.defense() + 0;
	}
	
	public double dps() {
		return character.dps() + 80;
	}
	
	public double heals() {
		return character.heals() + 0;
	}
}
