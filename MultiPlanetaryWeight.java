package klas11g;

import java.util.Scanner;

public class MultiPlanetaryWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose one: Mercury Venus Mars Jupiter Saturn Uranus Neptun");		
		String planet = sc.nextLine();
		
		System.out.println("Your weight?");
		double w = sc.nextDouble();
		
		if(planet.equals("Mercury")) {
			w*=0.38;
		}else if(planet.equals("Venus")) {
			w*=0.91;
		}else if(planet.equals("Mars")) {
			w*=0.38;
		}else if(planet.equals("Jupiter")) {
			w*=2.36;
		}else if(planet.equals("Saturn")) {
			w*=0.92;
		}else if(planet.equals("Uranus")) {
			w*=0.89;
		}else if(planet.equals("Neptun")) {
			w*=1.13;
		}
		
		System.out.println("Your weight on " + planet + " is " + w +" kg.");		

	}

}