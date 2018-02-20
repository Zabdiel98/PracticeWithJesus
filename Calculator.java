import java.util.Scanner;
public class Calculator {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter your first number");
		double a=scanner.nextDouble();
	System.out.println("Enter your second number");
		double b=scanner.nextDouble();
	System.out.println("What would you like to do?");
		String c=scanner.next();
	
	if (c.equals("add")) {
		double x=Add(a,b);
		System.out.println(x);
		}
	else if (c.equals("subtract")) {
		double x=Subtract(a,b);
		System.out.println(x);
		}
	else if (c.equals("multiply")) {
		double x=Multiply(a,b);
		System.out.println(x);
		}
	else if(c.equals("divide")) {
		double x=Divide(a,b);
		System.out.println(x);
		}
	else {
		System.out.println("INCORRECT INPUT");
		}

}
public static double Add(double a, double b) {
	double x=(a+b);
	return x; 	
}
public static double Subtract(double a, double b) {
	double x=(a-b);
	return x;
}
public static double Multiply(double a, double b) {
	double x=(a*b);
	return x	;	
}
public static double Divide(double a, double b) {
	double x=(a/b);
	return x;
}
}
