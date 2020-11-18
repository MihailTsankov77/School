package klas11g;

public class Fan {
	
	public final static int SLOW = 1;
	public final static int MEDIUM = 2;
	public final static int FAST = 3;
	
	private int Speed = SLOW;
	private boolean SwitchedOn = false;
	private double Radius = 5;
	private String Color = "blue";
	
	public Fan() {}
	
	public void setSpeed(int _sp) {
		this.Speed = _sp;
	}
	
	public int getSpeed() {
		return this.Speed;
	}
	
	public void turnOn(boolean _on) {
		this.SwitchedOn = _on;
	}
	
	public boolean IsOn() {
		return this.SwitchedOn;
	}
	
	public void setRadius(double _rad) {
		this.Radius = _rad;
	}
	
	public double getRadius() {
		return this.Radius;
	}
	
	public void setColor(String _color) {
		this.Color = _color;
	}
	
	public String getColor() {
		return this.Color;
	}
	
	@Override
	public String toString() {
		return (this.SwitchedOn) ? "Speed : " + this.Speed + "	Color : " + this.Color + "Radius : " + this.Radius : "Fan is off.	Color : " + this.Color + "Radius : " + this.Radius; 
	}
	
}
