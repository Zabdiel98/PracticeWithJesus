import java.util.Scanner;
public class Multiplications {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter two numbers");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		double x=Multiply(a,b);
		
		System.out.println("The product is"+" "+x);
}

public static double Multiply(int a, int b) {
	double x=(a*b);
	return x;
}
}
