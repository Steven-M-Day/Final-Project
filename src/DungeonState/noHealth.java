package DungeonState;

public class noHealth implements State {

	Player player;
	 
	public noHealth(Player player) {
		this.player = player;
	}
  
	public void attack() {
		System.out.println("Cannot attack.");
	}
	
	public void takeDamage() {
		System.out.println("Ouch!");
	}

    public void fight() {
        System.out.println("Cannot fight.");
    }
    
    public void heal() { 
    	System.out.println("Cannot heal..");
    }
 
	public String toString() {
		return "No more health..";
	}
}
