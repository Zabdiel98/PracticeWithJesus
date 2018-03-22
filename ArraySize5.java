import java.util.Scanner;
public class ArraySize5 {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	int [] x=new int[5];
	
	for(int i=0; i<x.length;i++) {
		System.out.println("Enter a number");
		x[i]=scan.nextInt();
	}
	
	System.out.println(x[x.length-1]);
	

}
}
