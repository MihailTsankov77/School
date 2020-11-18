package klas11g;

public class FanTest {

	public static void main(String[] args) {
		
		Fan f1 = new Fan();
		f1.turnOn(true);
		f1.setRadius(10);
		f1.setColor("Yellow");
		f1.setSpeed(Fan.FAST);
		System.out.println(""+f1);
		
	}

}
