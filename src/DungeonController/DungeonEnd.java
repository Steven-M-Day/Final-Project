package DungeonController;
public class DungeonEnd implements Command {

	Dungeon dungeon;
	
	public DungeonEnd(Dungeon dungeon) {
		this.dungeon = dungeon;
	}
	
	public void execute() {
		dungeon.end();
	}
}
