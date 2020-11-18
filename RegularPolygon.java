package klas11g;

public class RegularPolygon {
	
	private int n = 3;
	private double sideLength = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {}
	
	public RegularPolygon(int _n, double _sideLength) {
		this.setN(_n);
		this.setSideLength(_sideLength);
	}
	
	public RegularPolygon(int _n, double _sideLength, double _x, double _y) {
		this.setN(_n);
		this.setSideLength(_sideLength);
		this.setX(_x);
		this.setY(_y);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String getPerimeter() {
		return Double.toString(this.n*this.sideLength);
	}
	
	public String getArea() {
		return Double.toString((this.n*this.sideLength*this.sideLength)/(4*Math.tan(Math.PI/this.n)));
	}
	
	
}
