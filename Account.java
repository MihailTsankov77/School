package klas11g;

import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private static double yearInterestRate = 0;
	private final Date date = new Date();
	

	public Account() {}
	
	public Account(int _id, double _balance) {
		this.setId(_id);
		this.setBalance(_balance);
	}

	public int getId() {
		return id;
	}

	public void setId(int _id) {
		this.id = _id;
	}

	public static double getYearInterestRate() {
		return Account.yearInterestRate;
	}

	public static void setYearInterestRate(double _yearInterestRate) {
		Account.yearInterestRate = _yearInterestRate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double _balance) {
		this.balance = _balance;
	}

	public Date getDate() {
		return date;
	}

	public static double getMonthlyInterestRate () {
		return Account.yearInterestRate/12;
	}
	
	public double getMonthlyInterest () {
		return (this.balance/100)*Account.getMonthlyInterestRate();
	}
	
	public void withdraw(int _withdraw) {
		this.balance -= _withdraw;
	}
	
	public void deposit(int _deposit) {
		this.balance += _deposit;
	}
	
}
