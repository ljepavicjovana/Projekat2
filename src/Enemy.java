
public class Enemy extends GameObject {
	 private String type;
	 private int damage;
	 private int health;

	 public Enemy(String type, int damage, int health, int x, int y, int width, int height) {
	        super(x, y, width, height);
	        if (type == null || type.trim().isEmpty()) {
	            throw new IllegalArgumentException("Type ne može biti prazan.");
	        }
	        this.type = type.trim();

	       
	        if (damage < 0 || damage > 100) {
	            throw new IllegalArgumentException("Damage mora biti između 0 i 100.");
	        }
	        this.damage = damage;

	        if (health < 0 || health > 100) {
	            throw new IllegalArgumentException("Health mora biti između 0 i 100.");
	        }
	        this.health = health;
}

	 public Enemy(String type2, int damage2, int health2, int x, int y, int width, int height) {
		
	 }
	
}
