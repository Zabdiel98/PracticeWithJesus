
public class Smallest {
public static void main(String[]args) {
	
	int x=Smaller(2,4);
	int y=Smaller(6,21);
	int z=Smaller(119,112);
	
	System.out.println("The smaller number is"+" "+x);
	System.out.println("The smaller number is"+" "+y);
	System.out.println("The smaller number is"+" "+z);
}

public static int Smaller(int a, int b) {
	
	if (a>b) {
		return b;
		}
	
	else {
		return a;
		}
	
	
}
}
