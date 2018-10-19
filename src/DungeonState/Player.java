package DungeonState;

public class Player {

	State fight;
	State hasHealth;
	State noHealth;
	State death;
	State state;
	
	int count = 0;
	
	public Player(int health) {
		death = new Death(this);
		hasHealth = new hasHealth(this);
		noHealth = new noHealth(this);
		fight = new Fight(this);

		this.count = health;
 		if (health > 0) {
			state = hasHealth;
		} else {
			state = death;
		}
	}
	
	public void fight() {
		state.fight();
	}
	
	public void takeDamage() {
		state.takeDamage();
	}
	
	public void attack() {
		state.attack();
	}
	
	public void heal() {
		state.heal();
	}
	
	int getCount() {
		return count;
	}
	
    public State getDeath() {
        return death;
    }

    public State getHashealthState() {
        return hasHealth;
    }
    
    public State getNoHealthState() {
        return noHealth;
    }

    public State getFightState() {
        return fight;
    }
	
	public void heal(int count) {
		this.count += count;
		System.out.println("Healed. Current health: " + this.count);
		state.heal();
	}
	
	public void takeDamage(int count) {
		if (count != 0) {
			this.count -= count;
		}
		System.out.println("Damage taken. Current health: " + this.count);
		state.takeDamage();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
    public State getState() {
        return state;
    }
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- Battle ----");
		result.append("\n");
		result.append("Health: " + count);
		result.append("\n");
		result.append("Current: " + state + "\n");
		return result.toString();
	}
}
