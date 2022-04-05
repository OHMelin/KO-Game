import java.util.Scanner;
/**
 * @author kenni
 * This class is used to read input from the player. It takes a string and divides it into two words. Eksemple: take sword -> word1 = take and word2 = sword
 * It then checks if these two words are valid words. It creates a Command constructor with the words --> we can then use the two words to do different actions
 *
 */
public class Parser {
//######Fields#######
Scanner scanner = new Scanner(System.in);
CommandWords commandWord = new CommandWords();
//######Methods######

public Command getCommand() {
	//Contains the whole line
	String readInput;
	//contains the first word in the line
	String word1 = null;
	//contains the second word the line
	String word2 = null;
	
	System.out.print("<");
	//User writes input
	readInput = scanner.nextLine();
	//A tokenizer to go through the string and choose words
	Scanner tokenizer = new Scanner(readInput);
	//Checks if there is another word in the string and assigens it to word1 and word2. It only takes the first two words.
	if(tokenizer.hasNext()) {
		word1 = tokenizer.next();
			if(tokenizer.hasNext()) {
				word2 = tokenizer.next();
			}
	}
	//Checks if the command is valid. If it's valid it creates a Command objekt with the words in it
	if(commandWord.isCommand(word1)) {
		return new Command(word1,word2);
	} else {
		return new Command(null, word2);
	}
}


//EndClass
}
