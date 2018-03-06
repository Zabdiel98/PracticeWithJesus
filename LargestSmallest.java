import java.util.Scanner;
public class LargestSmallest {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter three numbers");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
		
		
	if((a>b)&&(a>c)) {
		System.out.println(a+" "+"is the greatest number");
		}
	else if((b>a)&&(b>c)){
		System.out.println(b+" "+"is the greatest number");
		}
	else if((c>a)&&(c>b)) {
		System.out.println(c+" "+"is the greatest number");
	}
	
	if((a<b)&&(a<c)) {
		System.out.println(a+" "+"is the smallest number");
		}
	else if((b<a)&&(b<c)){
		System.out.println(b+" "+"is the smallest number");
		}
	else if((c<a)&&(c<b)) {
		System.out.println(c+" "+"is the smallest number");
	}
}}
