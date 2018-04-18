import java.util.Scanner;
public class Small_Big {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How many numbers are you entering?");
		int [] x=new int[scan.nextInt()];
				
	for (int i=0; i<x.length;i++) {
		System.out.println("Enter element "+(i+1));
			x[i]=scan.nextInt();
	}
	
	int a=x[0];
	int z=x[0];
	
	for (int j=0; j<x.length;j++) {
		if (x[j]<a) {
			a=x[j];
		}
		if (x[j]>z) {
			z=x[j];
		}
	}
	System.out.println("The biggest number is "+z);
	System.out.println("The smallest number is "+a);
}
}
