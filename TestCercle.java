public class Cercle {
	
	public class Centre 
	{
		private double x;
		private double y;
		
		public Centre(double x, double y) {
			super();
			this.setX(x);
			this.setY(y);
		}

		

		@Override
		public String toString() {
			return "Centre [x=" + x + ", y=" + y + "]";
		}

		/**
		 * @return the x
		 */
		public double getX() {
			return x;
		}

		/**
		 * @param x the x to set
		 */
		public void setX(double x) {
			this.x = x;
		}

		/**
		 * @return the y
		 */
		public double getY() {
			return y;
		}

		/**
		 * @param y the y to set
		 */
		public void setY(double y) {
			this.y = y;
		}
		
	}
	
	private Centre c;
	private double r;
	
	public Cercle(double x, double y, double r) {
		this.c = new Centre( x, y);
		this.setR(r);
	}
	
	/**
	 * @return the x
	 */
	public double getX() {
		return c.getX();
	}

	/**
	 * @param x the x to set
	 */
	public void setX(double x) {
		this.c.setX(x);
	}

	/**
	 * @return the y
	 */
	public double getY() {
		return c.getY();
	}

	/**
	 * @param y the y to set
	 */
	public void setY(double y) {
		this.c.setY(y);
	}

	/**
	 * @return the r
	 */
	public double getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(double r) {
		this.r = r;
	}

	
	public double surface()
	{
		double surface = Math.pow(this.getR(),2) * Math.PI;
		return Math.round(surface);
	}
	
	@Override
	public String toString() {
		return "Cercle [c=" + c + ", r=" + r + "]";
	}

	
	
}
