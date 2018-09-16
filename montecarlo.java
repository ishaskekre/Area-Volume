import java.util.Scanner;
public class montecarlo {
	public static void main(String[]args){
		Scanner keybd = new Scanner(System.in);
		System.out.println("enter the first interval of graph");
		int first = keybd.nextInt();
		System.out.println("enter the second interval of graph ");
		int second = keybd.nextInt();
		if ( second > first && first >=0){
		double match = 0;

		for (int t = 0; t < 10000; t++ ){
			double x = first + (second-first) * Math.random();
			double y = (Math.exp(-first) + 1) * Math.random();
			if (Math.exp(-x) >= y)
				match++;
		}

		double probability = match/10000;
		//System.out.println("probability: " + probability);
		double totalarea = (second-first) * (Math.exp(-first)+1);
		//System.out.println("total area " + totalarea);
		System.out.println("The integral of the function e^(-x) from " + first + " to " + second + " is equal to " + (probability * totalarea));
		}
		else 
			System.out.println("ERROR");
	}
}