package fr.dessin;

public class Run {

	public static void main(String[] args) {
		
		//Exo2
		Point2D p1 = new Point();
		Point2D p2 = null;
		
		p1.setX(3);
		p1.setY(5);
		
		p2.setX(6);
		p2.setY(1);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.translater(2, 2);
		System.out.println(p1);
		
		p2.translater(p1.getX(), p1.getY());
		System.out.println(p2);
		
		//Exo3
//		Point2D p1 = new Point2D(3, 5);
//		Point2D p2 = new Point2D(6, 1);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.translater(2, 2);
//		System.out.println(p1);
//		
//		p2.translater(p1.getX(), p1.getY());
//		System.out.println(p2);
		
		
	}

}