package Gear;
import Character.Character;

public class ClothArmor extends GearDecorator{

	Character character;
	
	public ClothArmor(Character character) {
		this.character = character;
	}
	
	public String getDescription() {
		return character.getDescription() + ", Cloth Armor";
	}
	
	public double health() {
		return character.health() + 15;
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
