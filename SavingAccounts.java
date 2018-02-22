
public class SavingAccounts {
	String user;
	int pin;
	double bal;

public SavingAccounts(String user, int pin, double bal) {
	this.user=user;
	this.pin=pin;
	this.bal=bal;
	
}
public double Withdraw(double with) {
	double x=(bal-with);
	
	return x;
}

public double Deposit(double dep) {
	double x=(bal+dep);
	
	return x;
}
}