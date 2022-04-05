
public class Game {
//##########Fields#######
Parser parser = new Parser();
Map map = new Map();


//########Methods###########

//Make the game play
public void play() {
	boolean finished = false;
	
	while(!finished) {
		Command command = parser.getCommand();
		finished = proccesCommand(command);
		
	}
}

//Receives information from the parser then procces the command. It will pick a action depending of the command.
public boolean proccesCommand(Command command) {
		boolean isQuit = false;
		
		String commandWord = command.getCommandWord();
		if(commandWord.equals("w")) {
			map.movePlayerW();
		}
		
		if(commandWord.equals("s")) {
			map.movePlayerS();
		}
		
		if(commandWord.equals("d")) {
			map.movePlayerD();
		}
		
		if(commandWord.equals("a")) {
			map.movePlayerA();
	}
	
		return isQuit;
	}
	
	
}
