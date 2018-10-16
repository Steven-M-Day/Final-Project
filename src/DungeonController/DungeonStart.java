package DungeonController;
public class DungeonStart implements Command {

	Dungeon dungeon;
	
	public DungeonStart(Dungeon dungeon) {
		this.dungeon = dungeon;
	}
	
	public void execute() {
		dungeon.start();
	}
}
