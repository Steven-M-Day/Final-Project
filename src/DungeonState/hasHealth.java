package DungeonState;

public class hasHealth implements State {

	Player player;
	 
	public hasHealth(Player player) {
		this.player = player;
	}
  
	public void attack() {
		System.out.println("Attacking!");
	}
	
	public void takeDamage() {
		System.out.println("Ouch!");
		if (player.getCount() <= 0) {
			System.out.println("You have taken your last breathe.");
			System.out.println("The dungeon has defeated you.");
			player.setState(player.getDeath());
		}
	}

    public void fight() {
        System.out.println("Ready to fight!");
    }
    
    public void heal() { 
    	System.out.println("Healing..");
    }
 
	public String toString() {
		return "I am ready for more exploring!";
	}
}
