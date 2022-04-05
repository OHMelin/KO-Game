
public class Health {
	double maxHealth;
	double currentHealth;
	boolean isAlive;
	boolean isPlayer;

	public Health() {
		maxHealth = 100;
		currentHealth = 100;
		isAlive = true;
		isPlayer = true;
	}

	public Health(double maxHealth) {
		this.maxHealth = maxHealth;
		currentHealth = maxHealth;
		isAlive = true;
		isPlayer = false;
	}

	// Getters
	public double getMaxHealth() {
		return maxHealth;
	}

	public double getCurrentHealth() {
		return currentHealth;
	}

	public boolean getIsAlive() {
		return isAlive;
	}

	// Setters
	public void setHealth(double maxHealth) {
		this.maxHealth = maxHealth;
	}

	public void setCurrentHealth(double currentHealth) {
		this.currentHealth = currentHealth;
	}

	public void setIsAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	// Adders
	public void addHealth(double amount) {
		if (currentHealth + amount > maxHealth) {
			currentHealth = maxHealth;
		} else {
			currentHealth += amount;
		}
	}

	// Subtracters
	public void takeHealth(double amount) {
		if (currentHealth - amount <= 0) {
			if (isPlayer) {
				playerDead();
			} else {
				enemyDead();
			}
		} else {
			currentHealth -= amount;
		}
	}

	// Death events
	public void playerDead() {
		isAlive = false;
		currentHealth = 0;

		System.out.println("########################################");
		System.out.println("#               You died!              #");
		System.out.println("########################################");
	}

	public void enemyDead() {
		isAlive = false;
		currentHealth = 0;

		System.out.println("You killed an enemy!");
	}

	// Display health bar
	/*
	 * String full is the full string we wish to return. I start by adding a start,
	 * then for every time i < currentHealth/10 i print | If current health is 60 it
	 * will print 6 characters My j value starts at 10 as the health bar length is
	 * 10 characters. So for every time we print | i subtract 1 Then I print . for
	 * every j left. Which is 4 (10-6) At last I print the end of the string and
	 * return the full string
	 */
	public String displayHealthBar() {
		String full = "[";
		int j = 10;
		double percentage = (currentHealth / maxHealth) * 100;

		for (int i = 0; i < percentage / 10; i++) {
			full += "|";
			j--;
		}
		for (int i = 0; i < j; i++) {
			full += ".";
		}
		full += "]";

		return full;
	}
}
