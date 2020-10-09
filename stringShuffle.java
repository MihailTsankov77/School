package klas11g;

import java.util.Scanner;

public class stringShuffle {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char [] alpha = new char [str.length()];
		
		for(int i =0; i< str.length();i++) {
			alpha[i] = str.charAt(i);
		}
		
		printRecursion(alpha, "");	
		
	}
	
	static void printRecursion(char [] alpha, String str) {
		
		String saver = str;
		
		if(alpha.length<=1) {
			
			str+=alpha[0];
			System.out.println(str);
			
		}else{
			
			for(int i = 0; i<alpha.length; i++) {
				str+=alpha[i];
				printRecursion(removeChar(alpha, alpha[i]), str);
				
				str= saver;
			}
		}		
	}

	private static char[] removeChar(char[] alpha, char c) {
		
		char [] beta = new char[alpha.length-1];
		int j= 0;
		
		for(int i = 0; i<alpha.length; i++) {
			
			if(c!=alpha[i]) {
				
				beta[j] = alpha[i];
				j++;
			}
		}
		return beta;
	}
}
