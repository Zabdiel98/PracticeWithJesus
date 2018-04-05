import java.util.Scanner;
public class AvgArray {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How many numbers are you entering?");
	
	double [] x= new double[scan.nextInt()];
	
	double sum=0;
			
	for(int i=0; i<x.length; i++) {
		System.out.println("Enter element"+" "+(i+1));
			x[i]=scan.nextDouble();	
			sum=(sum+x[i]);
	}
	double avg=(sum/x.length);
	System.out.println(avg);
}
}
