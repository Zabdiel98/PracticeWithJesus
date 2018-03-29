import java.util.Scanner;
public class Movie_Test {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	Movie one= new Movie("Hairspray", "Musical", "g");
	Movie two= new Movie("Shape of Water", "Drama", "r");
	Movie three= new Movie("Call Me By Your Name", "Romance", "r");
	Movie four= new Movie("Black Panther", "Action", "pg-13");
	Movie five= new Movie("Coco", "Family", "g");
	
	Movie [] list= {one,two,three,four,five};
	while (true) {
	System.out.println("Enter a movie");
		String x=scan.next();
	
	if (x.equals(one.name)) {
		System.out.println("The movie is"+" "+one.name+" "+"its genre is"+" "+one.genre+" "+"and its  rating is"+" "+one.rate);
		
		}
	else if (x.equals(two.name)) {
		System.out.println("The movie is"+" "+two.name+" "+"its genre is"+" "+two.genre+" "+"and its  rating is"+" "+two.rate);
		
		}
	else if (x.equals(three.name)) {
		System.out.println("The movie is"+" "+three.name+" "+"its genre is"+" "+three.genre+" "+"and its  rating is"+" "+three.rate);
		
		}
	else if (x.equals(four.name)) {
		System.out.println("The movie is"+" "+four.name+" "+"its genre is"+" "+four.genre+" "+"and its  rating is"+" "+four.rate);
		
		}
	else if (x.equals(five.name)) {
		System.out.println("The movie is"+" "+five.name+" "+"its genre is"+" "+five.genre+" "+"and its  rating is"+" "+five.rate);
		
		}
	else if (x.equals("Quit")){
		break;
		}
	else {
		System.out.println("Try Again or type 'Quit'");
	}
	}







}

}
