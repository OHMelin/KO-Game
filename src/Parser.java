

import java.util.*;

public class Parser {

    private Health health;
    Scanner input = new Scanner(System.in);
    public Parser() {
    	
    }
    
    public void input() {
    	do {
            String choice = input.next();
            
            if(choice.equals("help")){
                System.out.println();
            }
            if(choice.equals("profile")){
                System.out.println();
            }
            if(choice.equals("heal")){
                System.out.println();
            }
            
            //Walking
            if(choice.equals("w")){
                System.out.println();
            }
            if(choice.equals("a")){
                System.out.println();
            }
            if(choice.equals("s")){
                System.out.println();
            }
            if(choice.equals("d")){
                System.out.println();
            }
        } while (health.getIsAlive());
    }
}
