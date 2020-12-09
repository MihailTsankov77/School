package klas11g;

import java.util.Date;
import java.util.Scanner;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private static double yearInterestRate = 0;
	private final Date date = new Date();
	private Scanner sc;
	

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
	
	public void withdraw(double _withdraw) {
		this.balance -= _withdraw;
	}
	
	public void deposit(double _deposit) {
		this.balance += _deposit;
	}
	
	public void getMenu() {
		sc = new Scanner (System.in);
		int choice;
		while(true) {
			do {
			System.out.print("Main menu \n1: check balance \n2: withdraw \n3: deposit \n4: exit \nEnter a choice:");
			choice = sc.nextInt();
			}while(choice<1 || choice>4);
			
			if(choice == 1) System.out.println(this.getBalance());
			if(choice == 2){
				System.out.print("Enter an amount to withdraw: ");
				this.withdraw(sc.nextDouble());
			}
			if(choice == 3){
				System.out.print("Enter an amount to deposit: ");
				this.deposit(sc.nextDouble());
			}
			if(choice == 4) break;
		
		}
		//sc.close();
	}
	
}
