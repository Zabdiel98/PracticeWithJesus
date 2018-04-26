import java.util.Scanner;
public class EvenAndOddArray {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How many values would you like to enter?");
		int [] x= new int[scan.nextInt()];
		
	for(int i = 0; i<x.length; i++) {
		System.out.println("Enter value "+(i+1));
			x[i]=scan.nextInt();
	
		}
	
	System.out.print("Your even values are ");
	
	for(int i = 0;i<x.length;i++) {
		if ((x[i]%2==0)) {
			System.out.print(x[i]+" ");
		}
	}

}
}
