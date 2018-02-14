import java.util.Scanner;
public class Methods {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	int a=scanner.nextInt();
	int b=scanner.nextInt();
	
	int c = addNumbers(a,b);
	System.out.println(c);
}

public static int addNumbers(int a, int b) {
	int sum= (a+b);
	return sum;

}}
