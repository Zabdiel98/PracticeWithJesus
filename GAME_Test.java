import java.util.Scanner;
public class GAME_Test {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	GAME one = new GAME ("Monopoly", "Family", 8.5);
	GAME two = new GAME ("Chess", "Strategy", 9.1);
	GAME three = new GAME ("UNO", "Family", 9.5);
	GAME four = new GAME ("Clue", "Mystery", 7.8);
	GAME five = new GAME ("Candy Land", "Children", 6.8);
	
	GAME [] list = {one,two,three,four,five};
	
	System.out.println("What game are you looking for?");
		String x=scan.next();
		
		String z="Game not found";
	for(int i = 0; i<list.length;i++) {
		if (x.equals(list[i].name)) {
			z="The game is "+list[i].name+", it's a "+list[i].genre+" game and it has a rating of "+list[i].rating;
		}
		
		else {
		}	
	}
	
	System.out.println(z);
}

}
