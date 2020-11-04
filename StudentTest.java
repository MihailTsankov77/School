package klas11g;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Student [] clas = new Student [5];
		String name;
		int grade;
		for(int i=0; i<5; i++) {
			name = sc.nextLine();
			grade = Integer.parseInt(sc.nextLine());
			
			clas[i]= new Student(name, grade);
		}
		
		sc.close();
		
		for(int i=0; i<5; i++) {
			if(Student.stip(clas[i]))	System.out.println(""+clas[i]);
		}

	}

}
