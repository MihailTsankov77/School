package klas11g;

import java.util.Scanner;

public class ATM {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner (System.in);
		
		Account [] accs = new Account[10];
		for(int i = 0; i<accs.length; i++) accs[i] = new Account (i, 100);
		
		int id;
		while(true) {
			do {
				System.out.print("Enter Id:");
				id = sc.nextInt();
			}while(id<0 || id>accs.length);
			
			accs[id].getMenu();
			
			//if(		) break;
				
		}
		//sc.close();
	}
	
	

}
