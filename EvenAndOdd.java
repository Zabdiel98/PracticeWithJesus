import java.util.Scanner;
public class EvenAndOdd {
public static void main(String[]args) {
Scanner scan=new Scanner(System.in);

	int odd=0;
	int even=0;
	
	System.out.println("How many numbers are you entering?");
	
	int [] x= new int[scan.nextInt()];
	
	for(int i=0; i<x.length;i++) {
		System.out.println("enter element"+" "+(i+1));
			x[i]=scan.nextInt();
		if ((x[i]%2)==0) {
			even++;
		}
		else {
			odd++;
		}
	}
	System.out.println("There are"+" "+even+" "+"even numbers");
	System.out.println("And there are"+" "+odd+" "+" odd numbers");
}
}
