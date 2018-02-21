import java.util.Scanner;
public class PersonTest {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	
	
	System.out.println("What is your age?");
		int b=scanner.nextInt();
	System.out.println("What is your name?");
		String a=scanner.next();
		
	Person p1=new Person(a, b);
		
	System.out.println(p1.name+" "+"it is"+" "+p1.isAdult()+" "+"that you can vote.");
	
}
}
