package Monster;

public class MakeMonster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		
		Monster monster = creation.makeMonster("Orc");
		System.out.println("");
		System.out.println(monster);
		
		monster = creation.makeMonster("Orc");
		System.out.println("");
		System.out.println(monster);
		
		monster = creation.makeMonster("Treant");
		System.out.println("");
		System.out.println(monster);
	}

}
