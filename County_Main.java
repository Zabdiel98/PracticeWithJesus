import java.util.Scanner;
public class County_Main {
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("What is the name of the county?");
		String name=scanner.nextLine();
	System.out.println("What is the population?");
		int pop=scanner.nextInt();
	System.out.println("When was it established?");
		int year=scanner.nextInt();
	System.out.println("What is the land volume?");
		double land=scanner.nextDouble();
			
	County county=new County(name, pop, year, land);
	
	System.out.println("The name of the country is"+" "+county.name);
	System.out.println("The population is"+" "+county.pop+" "+"and it was established in"+" "+county.year);
	System.out.println("Its land volume is"+" "+county.land);
	
}
}