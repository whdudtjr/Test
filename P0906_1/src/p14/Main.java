package p14;

public class Main {

	public static void main(String[] args) {
		// 상속 다형성 오버라이딩 예제
		// new는 호출하는 것
		SCV s1 = new SCV();
		SCV s2 = new SCV();
		Marine m1 = new Marine();
		Tank t1 = new Tank();
		
		
		//부대 지정 - 다형성
		Unit[] arr = new Unit[12];
		arr[0] = new SCV();
		arr[1] = new Marine();
		arr[2] = new Tank();
		arr[3] = new Tank();
		arr[4] = new Tank();
		arr[5] = new Tank();
		arr[6] = new Marine();
		arr[7] = new Marine();
		arr[8] = new Marine();
		arr[9] = new Marine();
		arr[10] = new SCV();
		arr[11] = new SCV();
		
		//단체 이동
		for(Unit x : arr) {
			x.move();
		}
	}

}
// abstract - 인스턴스 생성이 안됨, new를 못 씀(호출을 못함)
// abstract 클래스를 상속받은 클래스는 반드시 abstract인 메서드를 무조건 재정의 해줘야 한다. 안해주면 문법 오류가 남
abstract class Unit{
	int hp;
	int ap;
	int speed;
	
	//abstract를 사용하면 메서드 구현을 하지않고 정의만 한다.
    abstract void move();
	void stop() {
		System.out.println("유닛이 멈춥니다.");
	}
	void attack() {
		System.out.println("유닛이 " + ap + "의 공격을 합니다.");
	}
	
}
class SCV extends Unit{
	
	SCV(){
		this.hp = 40;
		this.ap = 5;
		this.speed = 1;
	}
	//오버라이딩
	void move() {
		System.out.println("SCV가 자신만의 방식으로" + speed + "로 이동합니다.");
	}
	
}
class Marine extends Unit{
	
	//생성자
	Marine(){
		this.hp = 50;
		this.ap = 10;
		this.speed = 2;
	}
	//오버라이딩
	void move() {
		System.out.println("Marine이 자신만의 방식으로" + speed + "로 이동합니다.");
	}
}
class Tank extends Unit{
	
	Tank(){
		this.hp = 150;
		this.ap = 20;
		this.speed = 3;
	}
	//오버라이딩
	void move() {
		System.out.println("Tank가 자신만의 방식으로 " + speed + "로 이동합니다.");
	}
}