import java.util.Scanner;
public class TwoandThree {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter a number divisible by 2 and 3");
		double num=scan.nextDouble();
		
		double two=(num%2);
		double three=(num%3);
		
		if (two==0&&three==0) {
			System.out.println("That is true");
		}
		else {
			System.out.println("That is false");
		}
	
}
}
