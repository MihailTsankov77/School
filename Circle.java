package klas11g;

public class Circle {
	private double rad;
		
	public Circle(double _rad) {
		rad = _rad;
	}
	
	public double getArea() {
		return Math.PI*rad*rad;
	}
	
	public double getPerimeter() {
		return Math.PI*2*rad;
	}
	
	public void setRad(double _newRad) {
		rad = _newRad;
	}
	
	public double getRad() {
		return this.rad;
	}
}
