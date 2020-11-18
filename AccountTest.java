package klas11g;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account a1 = new Account(1122, 20000);
		Account.setYearInterestRate(4.5);
		
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println("Account a1: balance: " + Double.toString(a1.getBalance()) + " MonthlyInterestRate: " +  Double.toString(Account.getMonthlyInterestRate()) + " Date: " + a1.getDate() );
	}
}
