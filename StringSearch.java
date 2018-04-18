import java.util.Scanner;
public class StringSearch {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How many names are you entering?");
	String [] x= new String[scan.nextInt()];
	
	for(int i=0; i<x.length;i++) {
		System.out.println("Enter name "+(i+1));
		x[i]=scan.next();
	}
	
	System.out.println("Enter the name you would like to search for");
		String y=scan.next();
		
	String a="No match found";
		
	for (int z=0; z<x.length; z++) {
		if (y.equals(x[z])) {
			a="Match found with index "+z;
		}
		else {
		}
	}
System.out.println(a);
}
}
