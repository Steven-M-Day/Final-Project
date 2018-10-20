package Control;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Monster.Monster;
import Monster.MonsterCreation;
import Monster.MonsterFactory;

class MonsterJUnitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Testing Monster Factory Pattern..");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Monster Factory Pattern Test Complete.");
	}

	@Test
	final void testGetName() {
		System.out.println("----Testing Monster Name----");
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		
		Monster monster = creation.makeMonster("Orc");
		System.out.println("");
		System.out.println(monster.getName());
		System.out.println("");
		System.out.println("----------------------------");
	}

	@Test
	final void testGetRace() {
		System.out.println("----Testing Monster Race----");
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		
		Monster monster = creation.makeMonster("Orc");
		System.out.println("");
		System.out.println(monster.getRace());
		System.out.println("");
		System.out.println("----------------------------");
	}

	@Test
	final void testGetClas() {
		System.out.println("----Testing Monster Class----");
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		
		Monster monster = creation.makeMonster("Orc");
		System.out.println("");
		System.out.println(monster.getClas());
		System.out.println("");
		System.out.println("----------------------------");
	}

	@Test
	final void testShout() {
		System.out.println("----Testing Monster Shout----");
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		
		Monster monster = creation.makeMonster("Orc");
		System.out.println("");
		if(monster.getName().equals("Boss Man")) {
			System.out.println("");
			monster.bossShout();
		} else {
			System.out.println("");
			monster.shout();
		}
		System.out.println("");
		System.out.println("----------------------------");
	}

	@Test
	final void testBossShout() {
		System.out.println("----Testing Monster Boss Shout----");
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		
		Monster monster = creation.makeMonster("Boss");
		System.out.println("");
		if(monster.getName().equals("Boss Man")) {
			System.out.println("");
			monster.bossShout();
		} else {
			System.out.println("");
			monster.shout();
		}
		System.out.println("");
		System.out.println("----------------------------");
	}

	@Test
	final void testToString() {
		System.out.println("----Testing toString----");
		MonsterFactory factory = new MonsterFactory();
		MonsterCreation creation = new MonsterCreation(factory);
		
		Monster monster = creation.makeMonster("Orc");
		System.out.println("");
		System.out.println(monster.toString());
		System.out.println("");
		System.out.println("----------------------------");
	}

}
