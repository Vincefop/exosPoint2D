package fr.dessin;

public class Run {

	public static void main(String[] args) {
		
		//Exo2
//		Point2D p1 = new Point2D();
//		Point2D p2 = new Point2D();
//		
//		p1.setX(3);
//		p1.setY(5);
//		
//		p2.setX(6);
//		p2.setY(1);
//		
//		System.out.println(p1);
//		System.out.println(p2);
//		
//		p1.translater(2, 2);
//		System.out.println(p1);
//		
//		p2.translater(p1.getX(), p1.getY());
//		System.out.println(p2);
		
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
		
		//Exo4
		Point2D p1 = new Point2D(3,4);
		System.out.println(p1);
		
		Point2D p2 = new Point2D(5,2);
		System.out.println(p2);
		
		System.out.println(Point2D.getCompteur());
		
		
		//Exo5
		try {
			Point3D p3 = new Point3D();
			System.out.println(p3);
			
			p3.translater(1, 2, -3);
			System.out.println(p3);
			
			//CORRECTION
			Point2D p4 = new Point3D(5,5,5);
			System.out.println("p4 :" +p4);
			
		}catch(PointException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
