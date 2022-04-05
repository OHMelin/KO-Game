

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
		
		
		
		//########### TESTING ###########\\
		board.updateDrawMap();
		player.printAll();
	}
}

