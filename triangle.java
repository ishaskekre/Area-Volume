public class triangle extends cart2d{
	private double x3;
	private double y3;
	private double l1;
	private double l2;
	private double l3;

	// constructor
	public triangle(){
	    super ();
		x3=0;
		y3=0;
		l1=0;
		l2=0;
		l3=0;
	}

	// constructor
	public triangle(double p1, double p2, double p3,double p4, double p5, double p6){
		super (p1,p2,p3,p4, "triangle");
		x3=p5;
		y3=p6;
		sides();
	}

	// find sides of a triangle based on the points
	private void sides(){
		l1 = lengths(x1,y1,x2,y2);
		l2 = lengths(x2,y2,x3,y3);
		l3 = lengths(x3,y3,x1,y1);
		// System.out.println("Sides of the " + getName() + ": s1 = " + l1 + " s2 = " + l2 + " s3 = " + l3);
	}

	// find angles between three sides of a triangle
	public void angles(){
		double a1 = angle(l1,l2,l3);
		double a2 = angle(l2,l3,l1);
		double a3 = angle(l3,l1,l2);
		// System.out.println("Angles of the " + getName() + " in radians: a1 = " + a1 + " a2 = " + a2 + " a3 = " + a3);
	}

	// find perimeter of a triangle
	public double perimeter(){
		double per = l1+l2+l3;
		System.out.println("Perimeter of a " + getName() + ": " + per);
		return(per);
	}

	// find area of a triangle
	public double area(){
		double per = l1+l2+l3;
		double s = per/2;
		double area = Math.sqrt(s * (s-l1) * (s-l2) * (s-l3));
		System.out.println("Area of a " + getName() + ": " + area);
		return(area);
	}

	// print points creating a triangle
	public void print(){
		System.out.print("Points for a triangle: ");
		System.out.print("p1(" + x1 + "," + y1 + "), ");
		System.out.print("p2(" + x2 + "," + y2 + "), ");
		System.out.println("p3(" + x3 + "," + y3 + ")");
	}
}
