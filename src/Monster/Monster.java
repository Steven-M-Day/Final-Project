package Monster;
import java.util.ArrayList;

abstract public class Monster {

		String name;
		String race;
		String clas;
		ArrayList<String> gear = new ArrayList<String>();
		
		public String getName() {
			return name;
		}
		
		public String getRace() {
			return race;
		}
		
		public String getClas() {
			return clas;
		}
		
		public void shout() {
			System.out.println("You shall not pass!");
		}
		
		public String toString() {
			StringBuffer display = new StringBuffer();
			display.append("Monster: " + name);
			display.append(" the " + clas + "");
			display.append(" " + race + "\n");
			display.append("Equipped With: \n");
			
			for (String gears : gear) {
				display.append("- " + gears + "\n");
			}
			return display.toString();
		}
}
