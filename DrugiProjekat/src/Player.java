
	class Player {
	private String name;
	private int x;
	private int y;
	private int width;
	private int health;
	private int height;
	
	public Player(String name, int x, int y, int width, int health, int height) {
		
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.health = health;
		this.height = height;
	}

	public String getName() {
		
		return name;
	}

	public int getX() {
		
		return this.x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHealth() {
		return health;
	}

	public int getHeight() {
		return height;
	}

	public void setName(String name) {
		if(name == null || name.trim().isEmpty()) {
			this.name = "Player";
		}else {
			name=name.trim().replaceAll("\\s++", "");
			String[] dio = name.split(" ");
            for (int i = 0; i < dio.length; i++) {
                dio[i] = dio[i].substring(0, 1).toUpperCase() + dio[i].substring(1).toLowerCase();
			
			}
            this.name = String.join(" ", dio);}
	}

	public void setX(int x) {
		if(x<0) x=0;
		
		this.x = x;
	}

	public void setY(int y) {
		if(y<0) y=0;
		this.y = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHealth(int health) {
		if(health < 0 ) health =0;
		if(health > 100) health = 100;
		this.health = health;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return String.format("Ime [ime= %s, pozicija x =%d, pozicija y = %d, width =%d, height =d, health =d}",
				name, x, y, width, health, height);
	}
	
}
	