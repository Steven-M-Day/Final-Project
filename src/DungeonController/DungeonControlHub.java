package DungeonController;

public class DungeonControlHub {

	Command[] startCommands;
	Command[] endCommands;
	
	public DungeonControlHub() {
		startCommands = new Command[7];
		endCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			startCommands[i] = noCommand;
			endCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command startCommand, Command endCommand) {
		startCommands[slot] = startCommand;
		endCommands[slot] = endCommand;
	}
	
	public void setCommandStart(int slot, Command startCommand) {
		startCommands[slot] = startCommand;
	}
	
	public void setCommandEnd(int slot, Command endCommand) {
		endCommands[slot] = endCommand;
	}
 
	public void startSelected(int slot) {
		startCommands[slot].execute();
	}
 
	public void endSelected(int slot) {
		endCommands[slot].execute();
	}
}
