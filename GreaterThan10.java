import java.util.Scanner;
public class GreaterThan10 {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How many numbers would you like to enter?");
		int [] x=new int[scan.nextInt()];
		
	for (int i = 0; i<x.length; i++) {
		System.out.println("Enter element "+(i+1));
		x[i]=scan.nextInt();
	}
	
	for (int i = 0; i<x.length; i++) {
		int a=(x[i]%4);
		int b=(x[i]%5);
		
	if((a==0)&&(b==0)&&(x[i]>10)) {
		System.out.print(x[i]+" ");
		
	}
}
}}
