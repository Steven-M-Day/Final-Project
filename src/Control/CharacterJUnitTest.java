package Control;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Character.Character;
import Character.Warrior;

class CharacterJUnitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Testing Character Decorator Pattern.");
		System.out.println("");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Character Decorator Pattern Test Complete.");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("-----------------------------");
		System.out.println("");
	}

	@Test
	final void testGetDescription() {
		System.out.println("--Testing Character Description--");
		Character tank = new Warrior();
		System.out.println(tank.getDescription());
	}

	@Test
	final void testHealth() {
		System.out.println("--Testing Character Health--");
		Character tank = new Warrior();
		System.out.println(tank.health());
	}

	@Test
	final void testDps() {
		System.out.println("--Testing Character DPS--");
		Character tank = new Warrior();
		System.out.println(tank.dps());
	}

	@Test
	final void testHeals() {
		System.out.println("--Testing Character Heals--");
		Character tank = new Warrior();
		System.out.println(tank.heals());
	}

	@Test
	final void testDefense() {
		System.out.println("--Testing Character Defense--");
		Character tank = new Warrior();
		System.out.println(tank.defense());
	}
}