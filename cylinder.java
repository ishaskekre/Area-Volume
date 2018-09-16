public class cylinder extends cart3d{
	protected double radius;
	protected double height;

	// constructor
	public cylinder (){
		super();
		radius=0;
		height=0;
	}

	// constructor
	public cylinder (double r1,double h1){
		super("cyclinder");
		radius = r1;
		height = h1;
	}

	// find volume of a cylinder
	public double Volume(){
		double v = height *Math.PI*radius*radius;
		System.out.println("Volume of "+ getName() + ": " + v);
		return(v);
	}

	// find surface area of a cylinder
	public double SArea(){
		double a = 2*Math.PI*radius*height + 2*radius*radius*Math.PI;
		System.out.println("Surface Area of "+ getName() + ": " + a);
		return(a);
	}

	// print dimensions
	public void print(){
		System.out.print("Dimensions of a " + getName() + ": ");
		System.out.print("radius = " + radius + ", ");
		System.out.println("height = " + height);
	}
}