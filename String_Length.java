import java.util.Scanner;
public class String_Length {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter a word with an even amount of characters");
		String word=scan.nextLine();
		
		String x=Length(word);
		
	System.out.println(x);
	
}

public static String Length(String word) {
	int a=word.length();
	int b=(a%2);
	
	String x;
	
	if (b==0) {
		x="That is true";
		}
	
	else {
		x="That is false";
		}
	
	return x;
	
}
}
