package klas11g;

import java.util.Scanner;

public class PalidromicPrime {

public static void main(String[] args) {

for(int number = 2 , j =0; j<120; number++){
if(IsPalindromicPrime(number)){
System.out.print(number + " ");
j++;
if(j%10==0)		System.out.println();
}
}

}

public static boolean IsPrime(int number){
for(int i= 2; i<=Math.sqrt(number); i++){
if(number%i==0)	return false;
}
return true;
}

public static boolean IsPalindromic(int number){
String num = String.valueOf(number);

for(int i= 0; i<num.length()/2+1; i++){
if(num.charAt(i)!=num.charAt(num.length() -1 -i))	return false;
}
return true;
}

public static boolean IsPalindromicPrime(int number){
return IsPrime(number) && IsPalindromic(number);
}

}