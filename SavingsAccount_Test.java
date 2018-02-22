import java.util.Scanner;
public class SavingsAccount_Test {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	
	SavingAccounts one=new SavingAccounts("Jay", 100134, 100);
	SavingAccounts two=new SavingAccounts("Aileen", 100190, 1000);
	SavingAccounts three=new SavingAccounts("John", 100153, 3213);
	
	
	System.out.println("What is the account name?");
		String a=scan.nextLine();
	System.out.println("Enter your pin");
		int b=scan.nextInt();
	System.out.println("What is your account balance?");
		double c=scan.nextDouble();
		
	SavingAccounts current=new SavingAccounts(a,b,c);
		
	System.out.println("What is the account name?");
		String d=scan.next();
	System.out.println("Enter your pin");
		int e=scan.nextInt();
	System.out.println("What is your account balance?");
		double f=scan.nextDouble();
		
	SavingAccounts overdraft=new SavingAccounts(d,e,f);
		
	System.out.println(one.user+" "+"has"+" "+one.bal+" "+"in their account and their pin is"+" "+one.pin);
	System.out.println(two.user+" "+"has"+" "+two.bal+" "+"in their account and their pin is"+" "+two.pin);
	System.out.println(three.user+" "+"has"+" "+three.bal+" "+"in their account and their pin is"+" "+three.pin);
	System.out.println(current.user+" "+"has"+" "+current.bal+" "+"in their account and their pin is"+" "+current.pin);
	System.out.println(overdraft.user+" "+"has"+" "+overdraft.bal+" "+"in their account and their pin is"+" "+overdraft.pin);
	
}

}
