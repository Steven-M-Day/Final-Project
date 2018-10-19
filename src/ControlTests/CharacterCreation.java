package ControlTests;

import Gear.*;
import java.util.Random;
import java.util.Scanner;

import Character.Archer;
import Character.Character;
import Character.Cleric;
import Character.Mage;
import Character.Warrior;

public class CharacterCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Please enter your character name: ");
		String name = reader.next();
		System.out.println(" ");
		System.out.println("Welcome " + name);
		
		System.out.println(" ");
		
		boolean valid;
		
		System.out.println("Please select your character Class.");
		System.out.println("1: Warrior");
		System.out.println("2: Mage");
		System.out.println("3: Cleric");
		System.out.println("4: Archer");
		int n = reader.nextInt();
		valid = n < 5;
		
		System.out.println(" ");
		
		if(n == 1) {
			System.out.println(name + " the Warrior!");
			Character tank = new Warrior();
			

			System.out.println("Please Select your gear: ");
			System.out.println("1: Plate Armor");
			System.out.println("2: Leather Armor");
			System.out.println("3: Cloth Armor");
			int a = reader.nextInt();
			
			if(a == 1) {
				tank = new PlateArmor(tank);
			} else if(a == 2) {
				tank = new LeatherArmor(tank);
			} else if(a == 3) {
				tank = new ClothArmor(tank);
			} else {
				System.out.println("Sorry, not a valid input.");
			}


			System.out.println("Please Select your weapon: ");
			System.out.println("1: Sword and Shield");
			System.out.println("2: Great Axe");
			System.out.println("3: Staff");
			System.out.println("4: Bow");
			System.out.println("5: Club");
			int w = reader.nextInt();
			
			if(w == 1) {
				tank = new Sword(tank);
				tank = new Shield(tank);
			} else if(w == 2) {
				tank = new GreatAxe(tank);
			} else if(w == 3) {
				tank = new Staff(tank);
			} else if(w == 4) {
				tank = new Bow(tank);
			} else if(w == 5) {
				tank = new Club(tank);
			} else {
				System.out.println("Sorry, not a valid input.");
			}
			
			//System.out.println(tank.getName());
			System.out.println(name + " the " + tank.getDescription());
			System.out.println("    Health:  " + String.format("%,.2f",tank.health()));
			System.out.println("    DPS:     " + String.format("%,.2f",tank.dps()));
			System.out.println("    Heals:   " + String.format("%,.2f",tank.heals()));
			System.out.println("    Defense: " + String.format("%,.2f",tank.defense()));
			System.out.println(" ");
			
		} else if(n == 2) {
			System.out.println(name + " the Mage!");
			Character mage = new Mage();

			System.out.println("Please Select your gear: ");
			System.out.println("1: Plate Armor");
			System.out.println("2: Leather Armor");
			System.out.println("3: Cloth Armor");
			int a = reader.nextInt();
			
			if(a == 1) {
				mage = new PlateArmor(mage);
			} else if(a == 2) {
				mage = new LeatherArmor(mage);
			} else if(a == 3) {
				mage = new ClothArmor(mage);
			} else {
				System.out.println("Sorry, not a valid input.");
			}
			
			
			System.out.println("Please Select your weapon: ");
			System.out.println("1: Sword and Shield");
			System.out.println("2: Great Axe");
			System.out.println("3: Staff");
			System.out.println("4: Bow");
			System.out.println("5: Club");
			int w = reader.nextInt();
			
			if(w == 1) {
				mage = new Sword(mage);
				mage = new Shield(mage);
			} else if(w == 2) {
				mage = new GreatAxe(mage);
			} else if(w == 3) {
				mage = new Staff(mage);
			} else if(w == 4) {
				mage = new Bow(mage);
			} else if(w == 5) {
				mage = new Club(mage);
			} else {
				System.out.println("Sorry, not a valid input.");
			}
			
			//System.out.println(mage.getName());
			System.out.println(name + " the " + mage.getDescription());
			System.out.println("    Health: " + String.format("%,.2f",mage.health()));
			System.out.println("    DPS:     " + String.format("%,.2f",mage.dps()));
			System.out.println("    Heals:   " + String.format("%,.2f",mage.heals()));
			System.out.println("    Defense: " + String.format("%,.2f",mage.defense()));
			System.out.println(" ");
			
		} else if(n == 3) {
			System.out.println(name + " the Cleric!");
			Character healer = new Cleric();

			System.out.println("Please Select your gear: ");
			System.out.println("1: Plate Armor");
			System.out.println("2: Leather Armor");
			System.out.println("3: Cloth Armor");
			int a = reader.nextInt();
			
			if(a == 1) {
				healer = new PlateArmor(healer);
			} else if(a == 2) {
				healer = new LeatherArmor(healer);
			} else if(a == 3) {
				healer = new ClothArmor(healer);
			} else {
				System.out.println("Sorry, not a valid input.");
			}
			
			System.out.println("Please Select your weapon: ");
			System.out.println("1: Sword and Shield");
			System.out.println("2: Great Axe");
			System.out.println("3: Staff");
			System.out.println("4: Bow");
			System.out.println("5: Club");
			int w = reader.nextInt();
			
			if(w == 1) {
				healer = new Sword(healer);
				healer = new Shield(healer);
			} else if(w == 2) {
				healer = new GreatAxe(healer);
			} else if(w == 3) {
				healer = new Staff(healer);
			} else if(w == 4) {
				healer = new Bow(healer);
			} else if(w == 5) {
				healer = new Club(healer);
			} else {
				System.out.println("Sorry, not a valid input.");
			}
			
			//System.out.println(healer.getName());
			System.out.println(name + " the " + healer.getDescription());
			System.out.println("    Health: " + String.format("%,.2f",healer.health()));
			System.out.println("    DPS:     " + String.format("%,.2f",healer.dps()));
			System.out.println("    Heals:   " + String.format("%,.2f",healer.heals()));
			System.out.println("    Defense: " + String.format("%,.2f",healer.defense()));
			System.out.println(" ");
			
		} else if(n == 4) {
			System.out.println(name + " the Archer!");
			Character archer = new Archer();

			System.out.println("Please Select your gear: ");
			System.out.println("1: Plate Armor");
			System.out.println("2: Leather Armor");
			System.out.println("3: Cloth Armor");
			int a = reader.nextInt();
			
			if(a == 1) {
				archer = new PlateArmor(archer);
			} else if(a == 2) {
				archer = new LeatherArmor(archer);
			} else if(a == 3) {
				archer = new ClothArmor(archer);
			} else {
				System.out.println("Sorry, not a valid input.");
			}
			
			System.out.println("Please Select your weapon: ");
			System.out.println("1: Sword and Shield");
			System.out.println("2: Great Axe");
			System.out.println("3: Staff");
			System.out.println("4: Bow");
			System.out.println("5: Club");

			int w = reader.nextInt();
			
			if(w == 1) {
				archer = new Sword(archer);
				archer = new Shield(archer);
			} else if(w == 2) {
				archer = new GreatAxe(archer);
			} else if(w == 3) {
				archer = new Staff(archer);
			} else if(w == 4) {
				archer = new Bow(archer);
			} else if(w == 5) {
				archer = new Club(archer);
			} else {
				System.out.println("Sorry, not a valid input.");
			}
			
			//System.out.println(archer.getName());
			System.out.println(name + " the " + archer.getDescription());
			System.out.println("    Health: " + String.format("%,.2f",archer.health()));
			System.out.println("    DPS:     " + String.format("%,.2f",archer.dps()));
			System.out.println("    Heals:   " + String.format("%,.2f",archer.heals()));
			System.out.println("    Defense: " + String.format("%,.2f",archer.defense()));
			System.out.println(" ");
			
		} else if(!valid){
			System.out.println("Sorry, not valid input");
			System.out.println(" ");
			System.out.println("Please select your character Class.");
			System.out.println("1: Warrior");
			System.out.println("2: Mage");
			System.out.println("3: Cleric");
			System.out.println("4: Archer");
			n = reader.nextInt();
			
			System.out.println(" ");
		}
		
		
		System.out.println("Are you ready to enter the depths of the dungeon, " + name + "?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		System.out.println(" ");
		int yn = reader.nextInt();
		
		if(yn == 1) {
			System.out.println("Good luck");
		} else if(yn == 2) {
			System.out.println("We can't all be heros..");
		}
		
		
		
		// Enter the dungeon
		System.out.println("You enter the dungeon");
		System.out.println("You light your torch and begin to move forward through the damp and dark tunnel.");
		System.out.println("You hear a shrill sound in the distance, but you can't tell how far away it was.");
		System.out.println("");
		System.out.println("Continuing through the tunnel, you come to a fork in the road.");
		System.out.println("Do you go right or left?");
		System.out.println("1: Right");
		System.out.println("2: Left");
		int d1 = reader.nextInt();
		int d1n = rand.nextInt(20) + 1;
		
		if(d1 == 1) {
			System.out.println("You Decide to go Right.");
			if(d1n <= 10) {
				System.out.println("You continue to walk.");
			}else if(d1n > 10) {
				System.out.println("A monster attacks!");
			}
		} else if(d1 == 2) {
			System.out.println("You decide to go Left.");
			if(d1n <= 10) {
				System.out.println("A monster attacks!");
			}else if(d1n > 10) {
				System.out.println("You hear something in the distance.");
			}
		}
		
		reader.close();
		/*
		Character tank = new Warrior();
		tank = new PlateArmor(tank);
		tank = new Sword(tank);
		tank = new Shield(tank);
		System.out.println(tank.getName());
		System.out.println(tank.getDescription());
		System.out.println("    Health:  " + String.format("%,.2f",tank.health()));
		System.out.println("    DPS:     " + String.format("%,.2f",tank.dps()));
		System.out.println("    Heals:   " + String.format("%,.2f",tank.heals()));
		System.out.println("    Defense: " + String.format("%,.2f",tank.defense()));
		System.out.println(" ");
		
		Character healer = new Cleric();
		healer = new ClothArmor(healer);
		healer = new Club(healer);
		System.out.println(healer.getName());
		System.out.println(healer.getDescription());
		System.out.println("    Health: " + String.format("%,.2f",healer.health()));
		System.out.println("    DPS:     " + String.format("%,.2f",healer.dps()));
		System.out.println("    Heals:   " + String.format("%,.2f",healer.heals()));
		System.out.println("    Defense: " + String.format("%,.2f",healer.defense()));
		System.out.println(" ");
		
		Character archer = new Archer();
		archer = new LeatherArmor(archer);
		archer = new Bow(archer);
		System.out.println(archer.getName());
		System.out.println(archer.getDescription());
		System.out.println("    Health: " + String.format("%,.2f",archer.health()));
		System.out.println("    DPS:     " + String.format("%,.2f",archer.dps()));
		System.out.println("    Heals:   " + String.format("%,.2f",archer.heals()));
		System.out.println("    Defense: " + String.format("%,.2f",archer.defense()));
		System.out.println(" ");
		*/
	}

}
