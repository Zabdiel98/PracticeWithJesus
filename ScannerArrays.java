import java.util.Scanner;
public class ScannerArrays {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	int [] x=new int[3];
	int [] y=new int[3];
	int [] z=new int[3];
	
	for(int i=0;i<z.length; i++) {
		System.out.println("Enter integer"+" "+(i+1)+" "+"of the first set");
		x[i]=scan.nextInt();
		
		System.out.println("Enter integer"+" "+(i+1)+" "+"of the second set");
		y[i]=scan.nextInt();
		}
	
	for(int i=0;i<z.length; i++) {
		
		z[i]=(x[i]+y[i]); 
		System.out.println(z[i]);
		}
	
}
}
