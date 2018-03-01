import java.util.Scanner;
public class Penultimate {
public static void main(String[]main) {
	Scanner scan=new Scanner(System.in);

	System.out.println("Enter your favorite word please");
		String word=scan.next();
		
	String x=Word(word);
	
	System.out.println(x);
		
}

public static String Word(String word) {
	int l=word.length();
	char a=word.charAt(0);
	char b=word.charAt(l-2);
	String x= a + "" + b;
	
	return x;
	
}

}
