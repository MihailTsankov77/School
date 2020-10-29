package klas11g;

public class Craps {

	public static void main(String[] args) {
		int r1,r2, point=0;
		boolean go = true;
		while(go) {
			r1=Roll();
			r2=Roll();
			System.out.println("You rolled " + r1 + " + " + r2 + " = " + (r1+r2));
			
			switch(WinLose(r1+r2,point)) {
				case 1: 
					System.out.println("You win"); 
					go=false; break;
				case -1: 
					System.out.println("You lose"); 
					go=false; break;
				case 2:
					point= r1+r2;
					System.out.println("point is " + (r1+r2));
			}
			
		}
		
	}
	
	public static int Roll() {
		return (int)(Math.random()*6) +1;
	}
	

	
	public static int WinLose(int score, int point) {	
		if(point==0) {
			switch(score) {
			case 2: case 3: case 12:
				return -1;
			case 7: case 11:
				return 1;
			default	:
				return 2;
			}
		}else {
	
			if(score==point)return 1;
			if(score==7) return -1;
			
		}
		return 0;
	}

}
