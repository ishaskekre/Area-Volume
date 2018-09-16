public class rprism extends cart3d{
	private double length;
	private double width;
	private double height;

	// constructor
	public rprism (){
		super();
		length=0;
		width=0;
		height=0;
	}

	// constructor
	public rprism (double s1,double s2, double s3){
		super("rectangular prism");
		length = s1;
		width = s2;
		height = s3;
	}

	// find volume of a rectangular prism
	public double Volume(){
		double v = length*width*height;
		System.out.println("Volume of a "+ getName() + ": " + v);
		return(v);
	}

	// find surface area of a rectangular prism
	public double SArea(){
		double a = 2*(length * width + length * height + width * height);
		System.out.println("Surface Area of a "+ getName() + ": " + a);
		return(a);
	}

	// print dimensions of a rectangular prism
	public void print(){
		System.out.print("Sides of a rectangular prism: ");
		System.out.print("length = " + length + ", ");
		System.out.print("width = " + width + ", ");
		System.out.println("height = " + height);
	}
}