import java.util.Scanner;
public class SumOf10 {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How many numbers would you like to enter?");
	int [] x=new int[scan.nextInt()];
	
	int sum=0;
	
	for (int i = 0; i<x.length; i++) {
		System.out.println("Enter element "+(i+1));
		x[i]=scan.nextInt();
		sum=(sum+x[i]);
	}
	
	System.out.println("The sum of your elements is "+sum);
}
}
