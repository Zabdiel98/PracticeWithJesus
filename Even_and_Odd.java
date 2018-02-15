import java.util.Scanner;
public class Even_and_Odd {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter an even number");
		int a=scanner.nextInt();
		
	String x=Check(a);
		
	System.out.println(x);
}

public static String Check(int a) {
	
	int rem=(a%2);
	String x;

	if (rem==0) {
		return x="True";
		}
	else {
		return x="False";
		}
}
}
