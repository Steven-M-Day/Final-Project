package DungeonController;

public class DungeonRoom {

	String location = "";

	public DungeonRoom(String location) {
		this.location = location;
	}
	
	public void start() {
		System.out.println(location + " has been entered.");
	}
	
	public void end() {
		System.out.println(location + " has been beaten.");
	}
}
