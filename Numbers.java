package Morgenstar;

import java.util.Scanner;

public class Numbers {
	
	 public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		int num = Input.nextInt();
		
		for(int i =num;i>0;i--){
		   for(int j=i; j>1; j--){
		     System.out.print(j +" ");
		   }
		  
		   for(int j=1; j<=i; j++){
		     System.out.print(j +" ");
		   }
		   System.out.println();
		}

}
}