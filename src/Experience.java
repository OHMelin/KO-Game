
public class Experience {
	double currentExp;
	int currentLevel;
	double expToLevel;

	public Experience() {
		currentExp = 0;
		currentLevel = 1;
		expToLevel = 100;
	}

	// Getters
	public double getCurrentExp() {
		return currentExp;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public double getExpToLevel() {
		return expToLevel;
	}

	// Setters
	public void setCurrentExp(double currentExp) {
		this.currentExp = currentExp;
	}

	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}

	public void setExpToLevel(double expToLevel) {
		this.expToLevel = expToLevel;
	}

	// Adders
	public void addExp(double amount) {
		currentExp += amount;
		if (currentExp >= expToLevel) {
			addLvl();
		}
	}

	public void addLvl() {
		currentExp -= expToLevel;
		currentLevel++;
		System.out.println();
		System.out.println("########################################");
		System.out.println("#               Level up!              #");
		System.out.println("#              New level: " + currentLevel + "            #");
		System.out.println("########################################");
		System.out.println();
	}

	// Display exp bar
	/*
	 * String full is the full string we wish to return. I start by adding a start,
	 * then for every time i < currentExp/10 i print | If current exp is 60 it will
	 * print 6 characters My j value starts at 10 as the health bar length is 10
	 * characters. So for every time we print | i subtract 1 Then I print . for
	 * every j left. Which is 4 (10-6) At last I print the end of the string and
	 * return the full string
	 */
	public String displayExpBar() {
		String full = "[";
		int j = 10;
		double percentage = (currentExp / expToLevel) * 100;

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
