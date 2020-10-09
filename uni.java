package Morgenstar;

import java.util.Scanner;

public class uni {

  public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double debt = sc.nextDouble();
int inc = sc.nextInt();

for(int i =0; i<10;i++){
   debt+= debt*inc/100;
   
}
System.out.println(debt);

double oldDebt= debt;

for(int i =0; i<4;i++){
   debt += debt *inc/100;
}

System.out.println(debt-oldDebt);
  }

}