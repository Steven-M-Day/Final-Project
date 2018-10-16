package Gear;
import Character.Character;

public class PlateArmor extends GearDecorator {

	Character character;
	
	public PlateArmor(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Plate Armor";
	}
	
	public double health() {
		return character.health() + 25;
	}
	
	public double defense() {
		return character.defense() + 100;
	}
	
	public double dps() {
		return character.dps() + 0;
	}
	
	public double heals() {
		return character.heals() + 0;
	}
}
