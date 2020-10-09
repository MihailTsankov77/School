package klas11g;

import java.util.Scanner;

public class Anagam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First?");
		String s1 = sc.nextLine().toLowerCase().replace(" ", "").replace(".", "").replace("?", "").replace(",", "").replace(":", "");
		
		System.out.println("Second?");
		String s2 = sc.nextLine().toLowerCase().replace(" ", "").replace(".", "").replace("?", "").replace(",", "").replace(":", "");
		
		char sym;
		boolean cont =false, no =false;
		for(int i =0 ; i<s1.length(); i ++) {
			
			sym = s1.charAt(i);
			
			for(int j = 0;j<s2.length();j++) {
				if(sym==s2.charAt(j)) {
					cont =true;
					break;
				}
				
			}
			if(!cont) {
				no = true;
				break;
			}else {
				cont = false;
			}
			
		}
		
		if(!no) {
			System.out.println("Poly");
		}else {
			System.out.println("no Poly");
		}
	}

}
