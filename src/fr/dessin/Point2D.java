package fr.dessin;

public class Point2D {
	private int x;
	private int y;
	private static int compteur = 0;
	
	public Point2D() {
		this(0,0);
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		compteur++;
	}
	
	/**
	 * La methode translater transforme un point (x,y) en point (x+dX, y+dY)
	 * @param dX
	 * @param dY
	 */
	public void translater( int dX, int dY) {
		this.setX(dX+this.getX());
		this.setY(dY+this.getY());
	}
	
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * @return the compteur
	 */
	public static int getCompteur() {
		return compteur;
	}
	
	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "] 		compteur = " + getCompteur();
	}
	
	
}
