package klas11g;

public class MyPoint {
	
	private double x;
	private double y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(double _x, double _y) {
		this.x = _x;
		this.y = _y;
	}
	
	public double distance(MyPoint p) {
		return Math.sqrt((this.x-p.x)*(this.x-p.x) + (this.y-p.y)*(this.y-p.y));
	}
	
	public double distance(double x, double y) {
		return Math.sqrt((this.x-x)*(this.x-x) + (this.y-y)*(this.y-y));
	}
	
	public static double distance(MyPoint p, MyPoint c) {
		return Math.sqrt((c.x-p.x)*(c.x-p.x) + (c.y-p.y)*(c.y-p.y));
	}
}
