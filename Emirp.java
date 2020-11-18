package klas11g;

public class Emirp {

public static void main(String[] args) {

for(int number = 2 , j =0; j<120; number++){
if(IsEmirp(number)){
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

private static int Reverse(int number) {
	
	String num = String.valueOf(number);
	String alpha="";
	
	for(int i=num.length()-1; i>=0; i--) {
		alpha += String.valueOf(num.charAt(i));
	}
	return Integer.parseInt(alpha);
}

private static boolean IsEmirp(int number) {
	return !IsPalindromic(number) && IsPrime(number) && IsPrime(Reverse(number));
}




}
