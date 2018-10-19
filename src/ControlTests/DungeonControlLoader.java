package ControlTests;


import DungeonController.Dungeon;
import DungeonController.DungeonControlHub;
import DungeonController.DungeonEnd;
import DungeonController.DungeonRoom;
import DungeonController.DungeonRoomEnd;
import DungeonController.DungeonRoomStart;
import DungeonController.DungeonStart;

public class DungeonControlLoader {

	public static void main(String[] args) {
		DungeonControlLoader dungeonControlLoader = new DungeonControlLoader();
		dungeonControlLoader.dungeonSwitch();
	}
	
	public void dungeonSwitch() {
		DungeonControlHub dungeonControlHub = new DungeonControlHub();
		
		Dungeon dungeonStart = new Dungeon("Dungeon Start");
		DungeonRoom dungeonRoom1 = new DungeonRoom("Room 1");
		DungeonRoom dungeonRoom2 = new DungeonRoom("Room 2");
		Dungeon dungeonEnd = new Dungeon("Dungeon End");
		
		DungeonStart dungeonBegin = new DungeonStart(dungeonStart);
		DungeonRoomStart dungeonRoom1Start = new DungeonRoomStart(dungeonRoom1);
		DungeonRoomEnd dungeonRoom1End =new DungeonRoomEnd(dungeonRoom1);
		DungeonRoomStart dungeonRoom2Start = new DungeonRoomStart(dungeonRoom2);
		DungeonRoomEnd dungeonRoom2End =new DungeonRoomEnd(dungeonRoom2);
		DungeonEnd dungeonStop = new DungeonEnd(dungeonEnd);
		
		System.out.println("");
		System.out.println("---- Entering Dungeon ----");
		dungeonControlHub.setCommandStart(0, dungeonBegin);
		dungeonControlHub.startSelected(0);
		System.out.println("");
		System.out.println("---- Entering Room 1 ----");
		dungeonControlHub.setCommandStart(1, dungeonRoom1Start);
		dungeonControlHub.startSelected(1);
		System.out.println("");
		System.out.println("---- Exiting Room 1 ----");
		dungeonControlHub.setCommandEnd(2, dungeonRoom1End);
		dungeonControlHub.endSelected(2);
		System.out.println("");
		System.out.println("---- Entering Room 2 ----");
		dungeonControlHub.setCommandStart(3, dungeonRoom2Start);
		dungeonControlHub.startSelected(3);
		System.out.println("");
		System.out.println("---- Exiting Room 2 ----");
		dungeonControlHub.setCommandEnd(4, dungeonRoom2End);
		dungeonControlHub.endSelected(4);
		System.out.println("");
		System.out.println("---- Exiting Dungeon ----");
		dungeonControlHub.setCommandEnd(5, dungeonStop);
		dungeonControlHub.endSelected(5);
		System.out.println("");

	}
}

	
