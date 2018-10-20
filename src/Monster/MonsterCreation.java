package Monster;

public class MonsterCreation {

	MonsterFactory factory;
	
	public MonsterCreation(MonsterFactory factory) {
		this.factory = factory;
	}
	
	public Monster makeMonster(String type) {
		Monster monster;
		
		monster = factory.monsterCreation(type);
		if(monster.name.equals("Boss Man")) {
			System.out.println("");
			monster.bossShout();
		} else {
			System.out.println("");
			monster.shout();
		}
		
		return monster;
	}
}
