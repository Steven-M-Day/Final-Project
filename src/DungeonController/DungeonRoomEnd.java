package DungeonController;
public class DungeonRoomEnd implements Command {

	DungeonRoom dungeonRoom;
	
	public DungeonRoomEnd(DungeonRoom dungeonRoom) {
		this.dungeonRoom = dungeonRoom;
	}
	
	public void execute() {
		dungeonRoom.end();
	}
}
