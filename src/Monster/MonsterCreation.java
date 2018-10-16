package Monster;

public class MonsterCreation {

	MonsterFactory factory;
	
	public MonsterCreation(MonsterFactory factory) {
		this.factory = factory;
	}
	
	public Monster makeMonster(String type) {
		Monster monster;
		
		monster = factory.monsterCreation(type);
		monster.shout();
		
		return monster;
	}
}
