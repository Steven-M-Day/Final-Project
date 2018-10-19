package Control;
import Gear.*;
import Character.*;
import Character.Character;
import DungeonController.*;
import DungeonState.Player;
import Monster.*;

import java.util.Random;
import java.util.Scanner;

public class DungeonInterface {
	
	public void CharacterCreation(String name) {
		
		Scanner reader = new Scanner(System.in);
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
	}

	public void BeginDungeon(String name) {
		
		DungeonControlHub dungeonControlHub = new DungeonControlHub();
		Dungeon dungeonStart = new Dungeon("Dungeon Start");
		DungeonStart dungeonBegin = new DungeonStart(dungeonStart);
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Are you ready to enter the depths of the dungeon, " + name + "?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		System.out.println(" ");
		int yn = reader.nextInt();
		
		if(yn == 1) {
			System.out.println("Good luck, " + name);
		} else if(yn == 2) {
			System.out.println("We can't all be heros..");
		}
		
		System.out.println("");
		System.out.println("---- Entering Dungeon ----");
		dungeonControlHub.setCommandStart(0, dungeonBegin);
		dungeonControlHub.startSelected(0);
		System.out.println("");
		System.out.println("You enter the dungeon");
		System.out.println("You light your torch and begin to move forward through the damp and dark tunnel.");
		System.out.println("You hear a shrill sound in the distance, but you can't tell how far away it was.");
		System.out.println("");
		System.out.println("Continuing through the tunnel, you come to a fork in the road.");
		System.out.println("Do you go right or left?");
		System.out.println("1: Right");
		System.out.println("2: Left");
	}
	
	public void RoomOne(String name) {
		
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		Player player = new Player(12);
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		DungeonControlHub dungeonControlHub = new DungeonControlHub();
		DungeonRoom dungeonRoom1 = new DungeonRoom("Room 1");
		DungeonRoomStart dungeonRoom1Start = new DungeonRoomStart(dungeonRoom1);
		DungeonRoomEnd dungeonRoom1End =new DungeonRoomEnd(dungeonRoom1);
		
		int d1 = reader.nextInt();
		int d1n = rand.nextInt(20) + 1;
		
		if(d1 == 1) {
			System.out.println("You Decide to go Right.");
			if(d1n <= 10) {
				System.out.println("");
				System.out.println("You continue to walk.");
				System.out.println("There is a room up ahead.");
				System.out.println("");
				System.out.println("---- Entering Room 1 ----");
				dungeonControlHub.setCommandStart(1, dungeonRoom1Start);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println(player);
				System.out.println("");
				System.out.println("A monster attacks!");
				System.out.println("");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				monster = creation.makeMonster("Treant");
				System.out.println("");
				System.out.println(monster);
				System.out.println("");
				player.fight();
				System.out.println("");
				player.takeDamage(3);
				System.out.println("");
				player.takeDamage(3);
				player.attack();
				System.out.println("");
				player.heal(4);
				System.out.println("");
				player.takeDamage(3);
				System.out.println("");
				player.takeDamage(3);
				System.out.println("");
				System.out.println("---- Exiting Room 1 ----");
				dungeonControlHub.setCommandEnd(2, dungeonRoom1End);
				dungeonControlHub.endSelected(2);
				System.out.println("");
			}else if(d1n > 10) {
				System.out.println("");
				System.out.println("---- Entering Room 1 ----");
				dungeonControlHub.setCommandStart(1, dungeonRoom1Start);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println(player);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				System.out.println("");
				player.fight();
				System.out.println("");
				player.takeDamage(3);
				System.out.println("");
				player.takeDamage(3);
				player.attack();
				System.out.println("");
				player.heal(4);
				System.out.println("");
				player.takeDamage(3);
				System.out.println("");
				player.takeDamage(3);
				System.out.println("");
				System.out.println("---- Exiting Room 1 ----");
				dungeonControlHub.setCommandEnd(2, dungeonRoom1End);
				dungeonControlHub.endSelected(2);
				System.out.println("");

			}
		} else if(d1 == 2) {
			System.out.println("You decide to go Left.");
			System.out.println("");
			System.out.println("---- Entering Room 1 ----");
			dungeonControlHub.setCommandStart(1, dungeonRoom1Start);
			dungeonControlHub.startSelected(1);
			System.out.println("");
			System.out.println(player);
			System.out.println("");
			System.out.println("A monster attacks!");
			Monster monster = creation.makeMonster("Orc");
			System.out.println("");
			System.out.println(monster);
			
			monster = creation.makeMonster("Treant");
			System.out.println("");
			System.out.println(monster);
			System.out.println("");
			player.fight();
			System.out.println("");
			player.takeDamage(3);
			System.out.println("");
			player.takeDamage(3);
			player.attack();
			System.out.println("");
			player.heal(4);
			System.out.println("");
			player.takeDamage(3);
			System.out.println("");
			player.takeDamage(3);
			System.out.println("");
			System.out.println("---- Exiting Room 1 ----");
			dungeonControlHub.setCommandEnd(2, dungeonRoom1End);
			dungeonControlHub.endSelected(2);
			System.out.println("");
				
		}
	}
	
	public void RoomTwo(String name) {
		
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		DungeonControlHub dungeonControlHub = new DungeonControlHub();
		
		DungeonRoom dungeonRoom2 = new DungeonRoom("Room 2");
		DungeonRoomStart dungeonRoom2Start = new DungeonRoomStart(dungeonRoom2);
		DungeonRoomEnd dungeonRoom2End =new DungeonRoomEnd(dungeonRoom2);
		
		int d1 = reader.nextInt();
		int d1n = rand.nextInt(20) + 1;
		
		if(d1 == 1) {
			System.out.println("You Decide to go Right.");
			if(d1n <= 10) {
				System.out.println("");
				System.out.println("You continue to walk.");
				System.out.println("There is a room up ahead.");
				System.out.println("");
				System.out.println("---- Entering Room 2 ----");
				dungeonControlHub.setCommandStart(1, dungeonRoom2Start);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				
				monster = creation.makeMonster("Treant");
				System.out.println("");
				System.out.println(monster);
				
				System.out.println("");
				System.out.println("---- Exiting Room 2 ----");
				dungeonControlHub.setCommandEnd(2, dungeonRoom2End);
				dungeonControlHub.endSelected(2);
				System.out.println("");
			}else if(d1n > 10) {
				System.out.println("");
				System.out.println("---- Entering Room 2 ----");
				dungeonControlHub.setCommandStart(1, dungeonRoom2Start);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				
				System.out.println("");
				System.out.println("---- Exiting Room 2 ----");
				dungeonControlHub.setCommandEnd(2, dungeonRoom2End);
				dungeonControlHub.endSelected(2);
				System.out.println("");

			}
		} else if(d1 == 2) {
			System.out.println("You decide to go Left.");
			System.out.println("");
			System.out.println("---- Entering Room 2 ----");
			dungeonControlHub.setCommandStart(1, dungeonRoom2Start);
			dungeonControlHub.startSelected(1);
			System.out.println("");
			System.out.println("A monster attacks!");
			Monster monster = creation.makeMonster("Orc");
			System.out.println("");
			System.out.println(monster);
			
			monster = creation.makeMonster("Treant");
			System.out.println("");
			System.out.println(monster);
			
			System.out.println("");
			System.out.println("---- Exiting Room 2 ----");
			dungeonControlHub.setCommandEnd(2, dungeonRoom2End);
			dungeonControlHub.endSelected(2);
			System.out.println("");
				
		}
	}
	
	public void RoomThree(String name) {
		
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		DungeonControlHub dungeonControlHub = new DungeonControlHub();
		
		DungeonRoom dungeonRoom3 = new DungeonRoom("Room 3");
		DungeonRoomStart dungeonRoom3Start = new DungeonRoomStart(dungeonRoom3);
		DungeonRoomEnd dungeonRoom3End =new DungeonRoomEnd(dungeonRoom3);
		
		int d1 = reader.nextInt();
		int d1n = rand.nextInt(20) + 1;
		
		if(d1 == 1) {
			System.out.println("You Decide to go Right.");
			if(d1n <= 10) {
				System.out.println("");
				System.out.println("You continue to walk.");
				System.out.println("There is a room up ahead.");
				System.out.println("");
				System.out.println("---- Entering Room 3 ----");
				dungeonControlHub.setCommandStart(1, dungeonRoom3Start);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				
				monster = creation.makeMonster("Treant");
				System.out.println("");
				System.out.println(monster);
				
				System.out.println("");
				System.out.println("---- Exiting Room 3 ----");
				dungeonControlHub.setCommandEnd(2, dungeonRoom3End);
				dungeonControlHub.endSelected(2);
				System.out.println("");
			}else if(d1n > 10) {
				System.out.println("");
				System.out.println("---- Entering Room 3 ----");
				dungeonControlHub.setCommandStart(1, dungeonRoom3Start);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				
				System.out.println("");
				System.out.println("---- Exiting Room 3 ----");
				dungeonControlHub.setCommandEnd(2, dungeonRoom3End);
				dungeonControlHub.endSelected(2);
				System.out.println("");

			}
		} else if(d1 == 2) {
			System.out.println("You decide to go Left.");
			System.out.println("");
			System.out.println("---- Entering Room 3 ----");
			dungeonControlHub.setCommandStart(1, dungeonRoom3Start);
			dungeonControlHub.startSelected(1);
			System.out.println("");
			System.out.println("A monster attacks!");
			Monster monster = creation.makeMonster("Orc");
			System.out.println("");
			System.out.println(monster);
			
			monster = creation.makeMonster("Treant");
			System.out.println("");
			System.out.println(monster);
			
			System.out.println("");
			System.out.println("---- Exiting Room 3 ----");
			dungeonControlHub.setCommandEnd(2, dungeonRoom3End);
			dungeonControlHub.endSelected(2);
			System.out.println("");
				
		}
	}
	
	public void RoomFour(String name) {
		
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		DungeonControlHub dungeonControlHub = new DungeonControlHub();
		
		DungeonRoom dungeonRoom4 = new DungeonRoom("Room 4");
		DungeonRoomStart dungeonRoom4Start = new DungeonRoomStart(dungeonRoom4);
		DungeonRoomEnd dungeonRoom4End =new DungeonRoomEnd(dungeonRoom4);
		
		int d1 = reader.nextInt();
		int d1n = rand.nextInt(20) + 1;
		
		if(d1 == 1) {
			System.out.println("You Decide to go Right.");
			if(d1n <= 10) {
				System.out.println("");
				System.out.println("You continue to walk.");
				System.out.println("There is a room up ahead.");
				System.out.println("");
				System.out.println("---- Entering Room 4 ----");
				dungeonControlHub.setCommandStart(1, dungeonRoom4Start);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				
				monster = creation.makeMonster("Treant");
				System.out.println("");
				System.out.println(monster);
				
				System.out.println("");
				System.out.println("---- Exiting Room 4 ----");
				dungeonControlHub.setCommandEnd(2, dungeonRoom4End);
				dungeonControlHub.endSelected(2);
				System.out.println("");
			}else if(d1n > 10) {
				System.out.println("");
				System.out.println("---- Entering Room 4 ----");
				dungeonControlHub.setCommandStart(1, dungeonRoom4Start);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				
				System.out.println("");
				System.out.println("---- Exiting Room 4 ----");
				dungeonControlHub.setCommandEnd(2, dungeonRoom4End);
				dungeonControlHub.endSelected(2);
				System.out.println("");

			}
		} else if(d1 == 2) {
			System.out.println("You decide to go Left.");
			System.out.println("");
			System.out.println("---- Entering Room 4 ----");
			dungeonControlHub.setCommandStart(1, dungeonRoom4Start);
			dungeonControlHub.startSelected(1);
			System.out.println("");
			System.out.println("A monster attacks!");
			Monster monster = creation.makeMonster("Orc");
			System.out.println("");
			System.out.println(monster);
			
			monster = creation.makeMonster("Treant");
			System.out.println("");
			System.out.println(monster);
			
			System.out.println("");
			System.out.println("---- Exiting Room 4 ----");
			dungeonControlHub.setCommandEnd(2, dungeonRoom4End);
			dungeonControlHub.endSelected(2);
			System.out.println("");
				
		}
	}
	
	public void BossRoom(String name) {
		
		Random rand = new Random();
		Scanner reader = new Scanner(System.in);
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		DungeonControlHub dungeonControlHub = new DungeonControlHub();
		
		DungeonRoom bossRoom = new DungeonRoom("Room 1");
		DungeonRoomStart bossRoomStart = new DungeonRoomStart(bossRoom);
		DungeonRoomEnd bossRoomEnd =new DungeonRoomEnd(bossRoom);
		
		int d1 = reader.nextInt();
		int d1n = rand.nextInt(20) + 1;
		
		if(d1 == 1) {
			System.out.println("You Decide to go Right.");
			if(d1n <= 10) {
				System.out.println("");
				System.out.println("You continue to walk.");
				System.out.println("There is a room up ahead.");
				System.out.println("");
				System.out.println("---- Boss Room ----");
				dungeonControlHub.setCommandStart(1, bossRoomStart);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				
				monster = creation.makeMonster("Treant");
				System.out.println("");
				System.out.println(monster);
				
				System.out.println("");
				System.out.println("---- Boss Room ----");
				dungeonControlHub.setCommandEnd(2, bossRoomEnd);
				dungeonControlHub.endSelected(2);
				System.out.println("");
			}else if(d1n > 10) {
				System.out.println("");
				System.out.println("---- Boss Room ----");
				dungeonControlHub.setCommandStart(1, bossRoomStart);
				dungeonControlHub.startSelected(1);
				System.out.println("");
				System.out.println("A monster attacks!");
				Monster monster = creation.makeMonster("Orc");
				System.out.println("");
				System.out.println(monster);
				
				System.out.println("");
				System.out.println("---- Boss Room ----");
				dungeonControlHub.setCommandEnd(2, bossRoomEnd);
				dungeonControlHub.endSelected(2);
				System.out.println("");

			}
		} else if(d1 == 2) {
			System.out.println("You decide to go Left.");
			System.out.println("");
			System.out.println("---- Boss Room ----");
			dungeonControlHub.setCommandStart(1, bossRoomStart);
			dungeonControlHub.startSelected(1);
			System.out.println("");
			System.out.println("A monster attacks!");
			Monster monster = creation.makeMonster("Orc");
			System.out.println("");
			System.out.println(monster);
			
			monster = creation.makeMonster("Treant");
			System.out.println("");
			System.out.println(monster);
			
			System.out.println("");
			System.out.println("---- Boss Room ----");
			dungeonControlHub.setCommandEnd(2, bossRoomEnd);
			dungeonControlHub.endSelected(2);
			System.out.println("");
				
		}
	}
	
	public void EndDungeon(String name) {
		
		DungeonControlHub dungeonControlHub = new DungeonControlHub();
		Dungeon dungeonEnd = new Dungeon("Dungeon End");
		DungeonEnd dungeonStop = new DungeonEnd(dungeonEnd);
		
		System.out.println("");
		System.out.println("You have triumphed over the dungeon!");
		System.out.println("Treat yourself to the spoils of war.");
		System.out.println("Nothing can stop you in your adventures moving forward.");
		System.out.println("");
		
		System.out.println("");
		System.out.println("---- Exiting Dungeon ----");
		dungeonControlHub.setCommandEnd(5, dungeonStop);
		dungeonControlHub.endSelected(5);
		System.out.println("");

	}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter your character name: ");
		String name = reader.next();
		
		DungeonInterface dungeonInterface = new DungeonInterface();
		
		dungeonInterface.CharacterCreation(name);
		dungeonInterface.BeginDungeon(name);
		dungeonInterface.RoomOne(name);
		dungeonInterface.RoomTwo(name);
		dungeonInterface.RoomThree(name);
		dungeonInterface.RoomFour(name);
		dungeonInterface.BossRoom(name);
		dungeonInterface.EndDungeon(name);

		reader.close();
	}
}
