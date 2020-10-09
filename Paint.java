package klas11g;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Height?");
		int height = sc.nextInt();
		
		System.out.println("width?");
		int width = sc.nextInt();
		
		System.out.println("length?");
		int length = sc.nextInt();
		
		int size = 2*height*width + 2*height*length + 2*length*width;
		
		if(size%140<=90) {
			System.out.println((int)size/140 + " po 15$ \n" + (int)Math.ceil((double)size%140/30) + " po 4$");
		}else {
			System.out.println((int)Math.ceil((double)size/140) + " po 15$");
		}
	}

}
