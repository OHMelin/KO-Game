/**
 * @author kenni
 * This class is used to save the two words we get from our parser. We can then call these methods to make use of the words.
 * 
 */
public class Command {

private String commandWord;
private String secondWord;

//#####mConstructor#########
public Command(String word1, String word2) {
	commandWord = word1;
	secondWord = word2;
}


//######Methods#############

//get first Word
public String getCommandWord() {
	return commandWord;
}

//Get second word
public String getSecondWord() {
	return secondWord;
}





///EndClasss
}
