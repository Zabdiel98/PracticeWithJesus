import java.util.Scanner;
public class Phone_Test {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	Phone phone1=new Phone("Apple","Iphone X", 2017,999);
	Phone phone2=new Phone("Apple","Iphone SE", 2015,299);
	Phone phone3=new Phone("Google","Pixel 2", 2017,649);
	
	
	System.out.println("The"+" "+phone1.name+" "+"was released in"+" "+phone1.year+" "+"by"+" "+phone1.brand);
	System.out.println("The"+" "+phone2.name+" "+"was released in"+" "+phone2.year+" "+"by"+" "+phone2.brand);
	System.out.println("The"+" "+phone3.name+" "+"was released in"+" "+phone3.year+" "+"by"+" "+phone3.brand);

	System.out.println("What phone would would you like to buy? Enter 1, 2 or 3");
		int option=scanner.nextInt();
	
		
	if (option==1) {
		System.out.println("The"+" "+phone1.name+" "+"will cost"+" "+phone1.price+" "+"dollars.");
		}
	else if (option==2) {
		System.out.println("The"+" "+phone2.name+" "+"will cost"+" "+phone2.price+" "+"dollars.");
		}
	else if (option==3) {
		System.out.println("The"+" "+phone3.name+" "+"will cost"+" "+phone3.price+" "+"dollars.");
		}
	
}
}
