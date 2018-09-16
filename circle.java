public class circle extends cart2d{
	private double r1;

	// constructor
	public circle(){
	    super ();
		r1=0;
	}

	// constructor
	public circle(double p1, double p2, double p3,double p4){
		super (p1,p2,p3,p4, "circle");
		sides();
	}

	// find radius of a circle based on the points
	private void sides(){
		r1 = lengths(x1,y1,x2,y2);
		// System.out.println("Radius of the " + getName() + ": " + r1);
	}

	// find perimeter of a circle
	public double perimeter(){
		double per = 2*r1*Math.PI;
		System.out.println("Perimeter of a " + getName() + ": " + per);
		return(per);
	}

	// find area of a circle
	public double area(){
		double area = r1*r1*Math.PI;
		System.out.println("Area of a " + getName() + ": " + area);
		return(area);
	}
	
	// print points creating a circle
	public void print(){
		System.out.print("Points for a circle: ");
		System.out.print("p1(" + x1 + "," + y1 + "), ");
		System.out.println("p2(" + x2 + "," + y2 + ")");
	}

}
