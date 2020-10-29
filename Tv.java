package klas11g;

public class Tv {
	
	private int chanel;
	private int vol;
	private boolean on;
	
	public Tv(int _ch, int _vol, boolean _on) {
		chanel= _ch;
		vol=_vol;
		on = _on;
	}
	
	public void turnOn() {
		on=true;
	}
	
	public void turnOff() {
		on=false;
	}
	
	public void setChanel(int _newChan) {
		chanel = _newChan;
	}
	public void setVolume(int _newVol) {
		vol = _newVol;
	}
	public void chanelUp() {
		chanel ++;
	}
	public void chanelDown() {
		chanel --;
	}
	public void volumeUp() {
		vol ++;
	}
	public void volumeDown() {
		vol --;
	}
	
	
}
