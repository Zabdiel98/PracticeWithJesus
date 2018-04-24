import java.util.Scanner;
public class CAT_Test {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How many cats do you have?");
		CAT [] cats=new CAT[scan.nextInt()];
		
		
		for (int i=0; i<cats.length; i++) {
			System.out.println("Enter cat "+(i+1)+"'s name");
			String x=scan.next();		
			
			System.out.println("Enter cat "+(i+1)+"'s breed");
			String y=scan.next();
			
			cats [i]= new CAT(x,y);
			
		}
		
		
		System.out.println("The cat is named "+cats[cats.length/2].name+" and it is a "+cats[cats.length/2].breed);
}
}
