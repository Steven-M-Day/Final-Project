package Monster;

public class MonsterFactory {

	public Monster monsterCreation (String type) {
		
		Monster monster = null;
		
		if (type.equals("Orc")) {
			monster = new Orc();

		} else if (type.equals("Treant")) {
			monster = new Treant();
			
		}
		return monster;
	}
}
