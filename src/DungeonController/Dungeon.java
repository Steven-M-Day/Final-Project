package DungeonController;

public class Dungeon {

	String location = "";

	public Dungeon(String location) {
		this.location = location;
	}

	public void start() {
		System.out.println(location + " dungeon awaits you. Good luck.");
	}

	public void end() {
		System.out.println(location + " dungeon has been bested. Good job!");
	}
	
}
