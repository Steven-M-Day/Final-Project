package DungeonState;

public class Fight implements State {

	Player player;
	 
	public Fight(Player player) {
		this.player = player;
	}
  
	public void attack() {
		System.out.println("Attacking!");
	}
	
	public void takeDamage() {
		System.out.println("Ouch!");
	}

    public void fight() {
        System.out.println("Fighting!");
    }
    
    public void heal() { 
    	System.out.println("Healing..");
    }
 
	public String toString() {
		return "Fight!";
	}

}
