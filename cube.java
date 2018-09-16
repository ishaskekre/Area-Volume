public class cube extends cart3d{
	private double side;

	// constructor
	public cube (){
		super();
		side=0;
	}

	// constructor
	public cube (double s1){
		super("cube");
		side = s1;
	}

	// find volume of a cube
	public double Volume(){
		double v = Math.pow(side,3.0);
		System.out.println("Volume of a "+ getName() + ": " + v);
		return(v);
	}

	// find surface area of a cube
	public double SArea(){
		double a = 6*Math.pow(side,2);
		System.out.println("Surface Area of a "+ getName() + ": " + a);
		return(a);
	}

	// print dimensions of a cube
	public void print(){
		System.out.println("Side of a cube: " + side);
	}
}