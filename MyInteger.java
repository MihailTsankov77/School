package klas11g;

public class MyInteger {
	private int value;
	
	public MyInteger (int _value) {
		this.setValue(_value);
	}

	public int getValue() {
		return value;
	}

	private void setValue(int _value) {
		this.value = _value;
	}
	
	public boolean isEven() {
		return this.value%2==0;
	}
	
	public boolean isOdd() {
		return this.value%2!=0;
	}
	
	public  boolean IsPrime(){
		for(int i= 2; i<=Math.sqrt(this.value); i++){
			if(this.value%i==0)	return false;
		}
		return true;
	}
	
	public static boolean isEven(int _number) {
		return _number%2==0;
	}
	
	public static boolean isOdd(int _number) {
		return _number%2!=0;
	}
	
	public static boolean IsPrime(int _number){
		for(int i= 2; i<=Math.sqrt(_number); i++){
			if(_number%i==0)	return false;
		}
		return true;
	}
	
	public boolean equals (int _number) {
		return this.value == _number;
	}
	
	public boolean equals (MyInteger _integer) {
		return this.value == _integer.getValue();
	}
	
	
	
	public static int charParseInt(char[] arr) {
		int value = 0;
		for(int i = 0; i<arr.length; i++) {
			value += ((arr.length-i-1)*10 + Character.getNumericValue(arr[i]));  
		}
		return value;
	}
	
	 public static int StringParseInt(String arr) {
		return charParseInt(arr.toCharArray());
	} 
}
