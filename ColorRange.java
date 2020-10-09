package klas11g;

import java.util.Scanner;

public class ColorRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a color code");
		
		double wavelength = sc.nextDouble();
		
		
		if(wavelength >= 380.0 && wavelength<750.0) {
			if(wavelength >= 620.0) {
				System.out.println("The color is Red");
			}else if(wavelength >= 590.0) {
				System.out.println("The color is Orange");
			}else if(wavelength >= 570.0) {
				System.out.println("The color is Yellow");
			}else if(wavelength >= 495.0) {
				System.out.println("The color is Green");
			}else if(wavelength >= 450.0) {
				System.out.println("The color is Blue");
			}else {
				System.out.println("The color is Violet");
			}
		}else {
			System.out.println("The entered wavelength is not a part of the visible spectrum");
		}
		
	}

}
