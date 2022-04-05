

import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("########################################");
		System.out.println("#      Welcome to the game player!     #");
		System.out.println("########################################");
		System.out.println();

		//Initialize
		Map board = new Map();
		Health playerHealth = new Health();
		Health enemyHealth = new Health();
		Experience experience = new Experience();
		Player player = new Player("Oliver");
		Enemy enemy = new Enemy("Orc", 5.5);
		
		enemy.setHealth(enemyHealth);
		player.setHealth(playerHealth);
		player.setExperience(experience);
		
		
		
		//Test the map
		board.updateDrawMap();
		System.out.println();
		//Test the player printAll
		player.printAll();
		
//OLIVER
		
		
		/*Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		boolean run = true;
		
	
		do {			
			switch(input) {
				case "diller": 
					System.out.println("daller");
					input = "";
					input = sc.nextLine().toLowerCase();
					break;
				case "b":
					System.out.println("kenni");
					input = "";
					break;
			}
		} while (run);*/

	}
}

