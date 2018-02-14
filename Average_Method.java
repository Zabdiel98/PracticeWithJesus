
public class Average_Method {
public static void main(String[]args) {
	
	double x=average(118,36,22);
	double y=average(200,6,97);

	System.out.println("The average of the three numbers is"+" "+x);
	System.out.println("The average of the three numbers is"+" "+y);
}

public static double average(double a, double b, double c) {
	double sum=((a+b+c)/3);
	return sum;
	
}
}
