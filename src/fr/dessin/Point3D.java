package fr.dessin;

public class Point3D extends Point2D{
	private int z;
	
	public Point3D() {
		super();
	}
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	/**
	 * Méthode qui permet d'ajouter des valeurs aux coordonnées d'un point 3D
	 * @param dX
	 * @param dY
	 * @param dZ
	 */
	public void translater(int dX, int dY, int dZ) {
		super.setX(super.getX() + dX);
		super.setY(super.getY() + dY);
		this.z += dZ; 
		
	}
	/**
	 * @return the z
	 */
	public int getZ() {
		return z;
	}
	/**
	 * @param z the z to set
	 */
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Point3D [x=" + getX() + ", y=" + getY() + " , z=" + z + "]";
	}
	
	
}
