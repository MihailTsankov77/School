package klas11g;

import java.util.Scanner;
import java.util.Vector;

public class Anagam {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("First?");
		String s1 = sc.nextLine().toLowerCase();
		
			
		System.out.println("Second?");
		String s2 = sc.nextLine().toLowerCase();
	
	
		
		boolean cont =false;
		
		
		for(int i =0 ; i<s1.length(); i ++){
			
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
			
			for(int j = 0;j<s2.length();j++) {
				if(s2.charAt(j)>='a' && s2.charAt(j)<='z') {
				if(s1.charAt(i)==s2.charAt(j)) {
					cont =true;
					s2 = s2.substring(0, j-1) + s2.substring(j+1, s2.length()-1);
					break;
				}
			}else {
				s2 = s2.substring(0, j-1) + s2.substring(j+1, s2.length()-1);
			}
				
			}
			if(!cont){
				System.out.println("Not a Anagam");
				return;
			}else {
				
				cont = false;
			}
			
			}
			
			s1 = s1.substring(0, i-1) + s1.substring(i+1, s1.length()-1);
		
			
		}
		
			System.out.println("Anagam");
		
		
	}
}