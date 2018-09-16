public class triangle extends cart2d{
	public double x3;
	public double y3;
	private double l1;
	private double l2;
	private double l3;

	public triangle(){
	    super ();
		x3=0;
		y3=0;
		l1=0;
		l2=0;
		l3=0;
	}

	public triangle(double p1, double p2, double p3,double p4, double p5, double p6){
		super (p1,p2,p3,p4);
		x3=p5;
		y3=p6;
		lengths();
	}

	public void lengths(){
		l1 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		l2 = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		l3 = Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		System.out.println("l1 = " + l1 + " l2 = " + l2 + " l3 = " + l3);
	}

	public double perimeter(){
		double per = l1+l2+l3;
		System.out.println("perimeter = " + per);
		return(per);
	}

	public double area(){
		double per = l1+l2+l3;
		double s = per/2;
		double area = Math.sqrt(s * (s-l1) * (s-l2) * (s-l3));
		System.out.print("area = " + area);
		return(area);
	}
	

}
