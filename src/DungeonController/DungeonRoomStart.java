package DungeonController;
public class DungeonRoomStart implements Command {

	DungeonRoom dungeonRoom;
	
	public DungeonRoomStart(DungeonRoom dungeonRoom) {
		this.dungeonRoom = dungeonRoom;
	}
	
	public void execute() {
		dungeonRoom.start();
	}
}
