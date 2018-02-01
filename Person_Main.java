import java.util.Scanner;
public class Person_Main {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("What is your first name?");
		String first=scanner.nextLine();
	
	System.out.println("What is your last name?");
		String last=scanner.nextLine();
	
	System.out.println("What is your middle initial?");
		String middle=scanner.nextLine();
	
	System.out.println("What is your career?");
		String career=scanner.nextLine();
	
	System.out.println("What is your age?");
		int age=scanner.nextInt();
	
	
	
	Person person=new Person(first,last,middle,career,age);
	
	System.out.println("Your name is"+" "+person.First+" "+person.Middle+"."+" "+person.Last);
	System.out.println("You work as a"+" "+person.Career+" "+"and you are"+" "+person.Age);
	

	
}
}
