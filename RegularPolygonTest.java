package klas11g;

public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6,4);
		RegularPolygon p3 = new RegularPolygon (10, 4, 5.6, 7.8);
		
		System.out.println("p1: perimeter: " + p1.getPerimeter() + " Area: " + p1.getArea());
		System.out.println("p2: perimeter: " + p2.getPerimeter() + " Area: " + p2.getArea());
		System.out.println("p3: perimeter: " + p3.getPerimeter() + " Area: " + p3.getArea());
	}

}
