public class quadrilateral extends cart2d{
	private double x3;
	private double y3;
	private double x4;
	private double y4;
	private double l1;
	private double l2;
	private double l3;
	private double l4;
	private boolean isrect;

	// constructor
	public quadrilateral(){
	    super ();
		x3=0;
		y3=0;
		x4=0;
		y4=0;
		l1=0;
		l2=0;
		l3=0;
		l4=0;
		isrect=false;
	}

	// constructor
	public quadrilateral(double p1, double p2, double p3,double p4, double p5, double p6, double p7, double p8){
		super (p1,p2,p3,p4, "quadrilateral");
		x3=p5;
		y3=p6;
		x4=p7;
		y4=p8;
		isrect=false;
		sides();
	}

	// find sides of a quadrilateral based on the points
	private void sides(){
		l1 = lengths(x1,y1,x2,y2);
		l2 = lengths(x2,y2,x3,y3);
		l3 = lengths(x3,y3,x4,y4);
		l4 = lengths(x4,y4,x1,y1);
		// System.out.println("Sides of the " + getName() + ": s1 = " + l1 + " s2 = " + l2 + " s3 = " + l3 + " s4 = " + l4);
	}

	// find angles between four sides of a quadrilateral
	public void angles(){
		double diag1 = lengths(x1,y1,x3,y3);
		double diag2 = lengths(x2,y2,x4,y4);
		double a1 = angle(l1,l2,diag1);
		double a2 = angle(l2,l3,diag2);
		double a3 = angle(l3,l4,diag1);
		double a4 = angle(l4,l1,diag2);
		if ((int)(a1*180/Math.PI)==90 && (int)(a3*180/Math.PI)==90)
			isrect=true;
		else
			isrect=false;
		// System.out.println("Angles of the " + getName() + " in radians: a1 = " + a1 + " a2 = " + a2 + " a3 = " + a3 + " a4 = " + a4);
	}

	// find perimeter of a quadrilateral
	public double perimeter(){
		double per = l1+l2+l3+l4;
		System.out.println("Perimeter of a " + getName() + ": " + per);
		return(per);
	}

	// find area of a quadrilateral if square or rectangle
	public double area(){
		angles();
		if (l1 == l3 && l2 == l4 && isrect){
			double area = l1*l2;
			System.out.println("Area of a " + getName() + "(rectangle/square): " + area);
			return(area);
		}
		else {
			System.out.println("This shape is not a square or rectangle");
			return(0);
		}
	}

	// print points creating a quadrilateral
	public void print(){
		System.out.print("Points for a quadrilateral: ");
		System.out.print("p1(" + x1 + "," + y1 + "), ");
		System.out.print("p2(" + x2 + "," + y2 + "), ");
		System.out.print("p3(" + x3 + "," + y3 + "), ");
		System.out.println("p4(" + x4 + "," + y4 + ")");
	}
}
