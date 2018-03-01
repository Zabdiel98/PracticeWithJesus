import java.util.Scanner;
public class LastChar {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What is your favorite word?");
		String word=scan.nextLine();
	
		int l=word.length();
	
		char a=word.charAt(l-1);
		
		System.out.println(a);
}
}
