import java.util.ArrayList;
 class Game {
	 
	 public static boolean checkCollision(Player p, Enemy e) {
			return (p.getX() < e.getX() + e.getWidth() &&
			p.getX() + p.getWidth() > e.getX() &&
			p.getY() < e.getY() + e.getHeight() &&
			p.getY() + p.getHeight() > e.getY()); }
		
		
		public static void decreaseHealth(Player p, Enemy e, ArrayList<String> eventLog) {
	        int staroHealth = p.getHealth();
	        int novoHealth = staroHealth - e.getDamage();
	        p.setHealth(novoHealth);
	        eventLog.add("Pogodjen: Player  " + e.getTip() 
	        + " for " + e.getDamage() 
	        + " > HP " + staroHealth + "->" + novoHealth);
	    }

		public static void addEnemy(Enemy e, ArrayList<Enemy> enemies, ArrayList<String> eventLog) {
		    enemies.add(e);
		    eventLog.add("Dodao neprijatelja: " + e.getTip());
		    }
	 

}
