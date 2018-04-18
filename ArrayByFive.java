import java.util.Scanner;
public class ArrayByFive {
public static void main(String[]args) {
	Scanner scan=new Scanner (System.in);
	
	System.out.println("How many numbers would you like to enter?");
	int [] x = new int[scan.nextInt()]; 
	
	for (int i = 0;i<x.length;i++) {
		System.out.println("Enter element "+(i+1));		
		x[i]=(scan.nextInt()*5);
	}
	
	System.out.println("The new array consists of ");
	
	for(int j=0;j<x.length;j++) {
		System.out.print(x[j]+" ");
	}
	
}
}
