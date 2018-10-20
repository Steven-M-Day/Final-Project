package Monster;

public class MonsterFactory {

	public Monster monsterCreation (String type) {
		
		Monster monster = null;
		
		if (type.equals("Orc")) {
			monster = new Orc();

		} else if (type.equals("Treant")) {
			monster = new Treant();
			
		} else if (type.equals("Boss")) {
			monster = new Boss();
			
		}
		return monster;
	}
}
