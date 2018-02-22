import java.util.Scanner;
public class Deposit_and_Withdraw {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What is the account name?");
		String a=scan.nextLine();
	System.out.println("Enter your pin");
		int b=scan.nextInt();
	System.out.println("What is your account balance?");
		double c=scan.nextDouble();
		
	SavingAccounts one=new SavingAccounts(a,b,c);
	
	System.out.println("Are you withdrawing or depositing?");
		String answer=scan.next();
		
	if (answer.equals("depositing")) {
		
		System.out.println("How much are you depositing?");
		double dep=scan.nextDouble();	
		System.out.println(one.Deposit(dep));
		}
	
	else if (answer.equals("withdrawing")) {
		
		System.out.println("How much are you withdrawing?");
		double with=scan.nextDouble();
		System.out.println("Your new account balance is"+" "+one.Withdraw(with));
		}
}
}
