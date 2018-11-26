
public class SavingsAccount extends BankAccount
{
double INT_RATE=.25;
public double addInterest() 
{
	balance*=INT_RATE;
	return balance;
}
}
