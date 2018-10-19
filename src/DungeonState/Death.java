package DungeonState;

public class Death implements State {

	Player player;
	 
	public Death(Player player) {
		this.player = player;
	}
  
	public void attack() {
		System.out.println("Incapacitated. Cannot attack.");
	}
	
	public void takeDamage() {
		System.out.println("Ouch!");
	}

    public void fight() {
        System.out.println("Incapacitated. Cannot fight.");
    }
    
    public void heal() { 
    	System.out.println("Incapacitated. Cannot heal.");
    }

	public String toString() {
		return "You are dead..";
	}
}
