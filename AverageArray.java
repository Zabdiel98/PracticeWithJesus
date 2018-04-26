import java.util.Scanner;
public class AverageArray {
public static void main(String []args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How many values woul doyu like to enter?");
		int [] x=new int[scan.nextInt()];
		
		double sum=0;
		
	for (int i = 0; i<x.length;i++) {
		System.out.println("Enter value "+(i+1));
		x[i]=scan.nextInt();
		sum=(sum+x[i]);
	}
	
	System.out.println("The average of your values is "+(sum/x.length));
}
}
