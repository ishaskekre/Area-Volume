public class sphere extends cart3d{
	private double radius;

	// constructor
	public sphere (){
		super();
		radius=0;
	}

	// constructor
	public sphere (double r1){
		super("sphere");
		radius = r1;
	}

	// find volume of a sphere
	public double Volume(){
		double v = 4*Math.PI*radius*radius*radius/3;
		System.out.println("Volume of a "+ getName() + ": " + v);
		return(v);
	}

	// find surface area of a sphere
	public double SArea(){
		double a = 4*Math.PI*radius*radius;
		System.out.println("Surface Area of a "+ getName() +": " + a);
		return(a);
	}

	// print dimensions of a sphere
	public void print(){
		System.out.println("Radius of a sphere: " + radius);
	}
}