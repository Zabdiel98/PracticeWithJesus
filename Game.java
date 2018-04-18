import java.util.Scanner;
import java.util.Random;
public class Game {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	Random r=new Random ();
	
	int score=0;
	
	while(2<3) {
		System.out.println("Do you want to roll?");
			String word=scan.next();
	
		if (word.equals("yes")) {
			int rand=r.nextInt(6)+1;
			score=score+rand;
			
			if (rand==1) {
				System.out.println("You lose because you rolled a 1");
				System.out.println("Your score was "+score);
				break;
			}
			else {
				System.out.println("Your score is "+score);
			}
		}
		else if(word.equals("no")){
			System.out.println("OK :(");
			break;
		}
	}
}}
