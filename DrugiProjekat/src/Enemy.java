

	class Enemy {
		private String tip;
		private int x;
		private int y;
		private int width;
		private int height;
		private int damage;
		
		// Kosnstruktor
		public Enemy(String tip, int x, int y, int width, int height, int damage) {
			this.tip = tip;
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.damage = damage;
		}

		public String getTip() {
			return tip;
		}

		public void setTip(String tip) {
			this.tip = tip;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getDamage() {
			return damage;
		}

		public void setDamage(int damage) {
			if (damage >= 0 && damage <= 100) {
				this.damage = damage;
				} else {
				System.out.println("Damage mora biti u između 0-100!");
				}
		}
		
		@Override
		public String toString() {
			return String.format("Ime [tip= %s, pozicija x =%d, pozicija y = %d, width =%d, height =%d, damage =%d}",
					tip, x, y, width, height, damage);
		}
		
	}

