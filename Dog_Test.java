import java.util.Scanner;
public class Dog_Test {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	Dog[] dogs=new Dog[3];

	
	for (int i=0; i<dogs.length; i++) {
		System.out.println("Enter a dog breed");
		String x=scan.nextLine();		
		
		System.out.println("Enter a dog name");
		String y=scan.nextLine();
		
		dogs [i]= new Dog(x,y);
		
	}
	
	System.out.println("The dog breed is"+" "+dogs[1].breed+" "+"and their name is"+" "+dogs[1].name);
}
		
}
