import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		new Q2Solver().solve();
	}
}


class Q2Solver{
	
	private Runner takahasi;
	private Runner aoki;
	private int runTime; 

	
	public void solve() {
		// A - 조깅
		// 알고리즘 문제 스타트 - 입력 받기 API
		init();
		
		//위에까지 - 세팅
		for(int x = 0; x < runTime; x++) {
			takahasi.run();
			aoki.run();
		}
		if(takahasi.getDistance() > aoki.getDistance()) {
			System.out.println(takahasi.getName());
		}else if(aoki.getDistance() > takahasi.getDistance()) {
			System.out.println(aoki.getName());
		}else {
			System.out.println("draw");
		}
		
	}
	
	private void init() {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("값 입력 > ");
		String inputValue = scn.nextLine();//문자열
		System.out.println("입력 받은 값 : " + inputValue);

		String [] inputs = inputValue.split(" ");
		
		 int tMaxRun = Integer.parseInt(inputs[0]);
		 int tSpeed = Integer.parseInt(inputs[1]);
		 int tMaxRest = Integer.parseInt(inputs[2]);
		 int aMaxRun = Integer.parseInt(inputs[3]);
		 int aSpeed = Integer.parseInt(inputs[4]);
		 int aMaxRest = Integer.parseInt(inputs[5]);
		 runTime = Integer.parseInt(inputs[6]);
		 
		 takahasi = new Runner("takahasi",tSpeed,tMaxRun,tMaxRest);
		 aoki = new Runner("aoki",aSpeed,aMaxRun,aMaxRest);
		 scn.close();
	}
}

class Runner{
	
	private String name;
	
	private int speed;
	private int maximumStrength;
	private int maximumBreakTime;
	
	private int remainingHealth;
	private int remainingBreakTime;
	
	private int distance;
	
	public Runner(String name, int speed, int maximumStrength, int maximumBreakTime) {
		this.name = name;
		this.speed = speed;
		this.maximumStrength = maximumStrength;
		this.maximumBreakTime = maximumBreakTime;
		
		this.remainingHealth = maximumStrength;
	}
	
	public void run() {
		
		if(existHealth()) {
			distance += speed;
			decreaseHealth();
		}
	}
	
	private boolean existHealth(){
		return remainingHealth > 0;
	}
	
	private void decreaseHealth() {
		remainingHealth--;
		if(!existHealth()) {
			chargeBreakTime();
		}else {
			decreaseBreakTime();
		}
	}
	private void chargeBreakTime() {
		remainingBreakTime = maximumBreakTime;
	}
	
	private void decreaseBreakTime() {
		remainingBreakTime--;
		if(remainingBreakTime <=0) {
			remainingHealth = maximumStrength;
		}
	}
	
	public int getDistance() {
		return distance;
	}
	
	public String getName() {
		return name;
	}
}



