/**
 * @author kenni
 * This class contains all the command words we can use in the game --> it's in a array
 * It also contains a method to check if a command is in the array.
 *
 */
public class CommandWords {

	// ########Fields################
	private static final String[] commandWords = { "w", "a", "d", "s" };

	// ########Methods##############

	// Check if the string is a valid command
	public boolean isCommand(String string) {
		boolean stringFound = false;
		for (int index = 0; index < commandWords.length; index++) {
			if (commandWords[index].equals(string)) {
				stringFound = true;
			}
		} return stringFound;
	}
	
	
}
