import java.util.Scanner;
public class RectangleTest {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("How rectangles are you entering?");
		int x=scan.nextInt();
	
	for (int i=1; x>=i;i++) {
	
	System.out.println("What is the width of rectangle"+" "+i+"?" );
		double w=scan.nextDouble();
	System.out.println("What is the length of rectangle"+" "+i+"?" );
		double l=scan.nextDouble();
	
	Rectangle rec=new Rectangle(w,l);
	
	System.out.println("The perimeter of the rectangle"+" "+i+" "+"is"+" "+rec.Peri(w, l));
	System.out.println("The area of the rectangle"+" "+i+" "+"is"+" "+rec.Area(w, l));
	
	}
	}
}
