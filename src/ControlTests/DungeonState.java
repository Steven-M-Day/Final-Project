package ControlTests;


import DungeonState.Player;

public class DungeonState {

	public static void main(String[] args) {
		Player player = new Player(12);
		System.out.println("");
		System.out.println(player);
		player.fight();
		System.out.println("");
		player.attack();
		System.out.println("");
		System.out.println(player);
		System.out.println("");
		player.takeDamage(3);
		System.out.println("");
		player.attack();
		System.out.println("");
		player.takeDamage(3);
		System.out.println("");
		player.heal(4);
		System.out.println("");
		player.takeDamage(3);
		System.out.println("");
		player.takeDamage(3);
		System.out.println("");
		player.heal(4);
		System.out.println("");
		player.attack();
		System.out.println("");
		player.takeDamage(3);
		System.out.println("");
		player.takeDamage(3);
		System.out.println("");
		player.takeDamage(5);
		System.out.println("");
		System.out.println(player);

	}
}
