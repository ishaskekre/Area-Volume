public class cone extends cylinder{

	// constructor
	public cone (){
		super();
	}

	// constructor
	public cone (double r1,double h1){
		super(r1,h1);
		setName("cone");
	}

	// find volume of a cone
	public double Volume(){
		double v = height *Math.PI*radius*radius/3;
		System.out.println("Volume of a "+ getName() + ": " + v);
		return(v);
	}

	// find surface area of a cone
	public double SArea(){
		double a = radius*radius*Math.PI + Math.PI*radius*Math.sqrt(height*height + radius*radius);
		System.out.println("Surface Area of a "+ getName() + ": " + a);
		return(a);
	}
}