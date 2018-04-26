import java.util.Scanner;
public class Insurance {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What is your name?");
		String name=scan.nextLine();
	
	System.out.println("What is your age?");
		int age=scan.nextInt();
	
	System.out.println("What is your yearly income?");
		int income=scan.nextInt();	
		
	System.out.println("What is your weight?");
		double weight=scan.nextDouble();
		
	if (age<18) {
		System.out.println("You are considered a minor");
	}
	else if((age>=18)&&(age<38)&&(weight<200)) {
		System.out.println("You are considered healthy");
	}
	else if((age>=38)&&(age<58)&&(income>=50000)) {
		System.out.println("You are considered low risk");
	}
	else if(age>=58) {
		System.out.println("You are considered high risk");
	}
}
}
