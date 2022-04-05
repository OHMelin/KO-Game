

public class Enemy {
	
	String name;
	double damage;
	Health health;
	
	public Enemy(String name, double damage) {
		this.name = name;
		this.damage = damage;
	}
	
	
	//SET OTHER CLASSES
	public void setHealth(Health health) {
		this.health = health;
	}
}