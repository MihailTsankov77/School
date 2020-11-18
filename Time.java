package klas11g;


//use joda-time-2.4.jar
import org.joda.time.LocalTime;

public class Time {
	
	private int hour;
	private int minutes;
	private int seconds;
	
	public Time() {
		LocalTime lt = new LocalTime();
		this.hour = lt.getHourOfDay();
		this.minutes = lt.getMinuteOfHour();
		this.seconds = lt.getSecondOfMinute();
	}
	
	public Time(int _hour, int _minute, int _second) {
		this.hour = _hour;
		this.minutes = _minute;
		this.seconds = _second;
	}
	
	public Time(int _miliseconds) {
		this.hour = (_miliseconds/1000)/3600;
		this.minutes = (_miliseconds/1000 - this.hour*3600)/60;
		this.seconds =_miliseconds/1000 - this.hour*3600 - this.minutes*60;
	}

	
	@Override
	public String toString() {
		return this.hour + " : " + this.minutes + " : " + this.seconds;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	public int getSeconds() {
		return this.seconds;
	}
	
	
}
