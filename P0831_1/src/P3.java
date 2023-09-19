
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("현대", 5, 10);
		int c = c1.doSomeThing(4,5); // 메서드 호출 문법
		System.out.println(c);
	}

}

class Car{
	//속성
	String name;
	int speed;
	int fuel;
	
	//생성자
	Car(String name, int speed, int fuel){
		this.name = name;
		this.speed = speed;
		this.fuel = fuel;
	}
	//기능  - 메서드
	// 함수는 외부값에만 의존, 메서드는 필드값에도 의존
	//메서도 정의 문법: 리턴 타입 메서드명(파라미터N){....}
	//리턴 타입 존재 시 항상 그에 맞는 값을 리턴해 줘야 한다.
	//메서드명 명명법:카멜 케이스 - 동사
	//*클래스 안에서의 필드값이 안 쓰이면 응집도가 낮은 코드이다.
	
	void 기름을채우다(int amount) {
		fuel += amount;
	}
	
	boolean run() {
		if(fuel<=0) {
			System.out.println("경고] 기름이 없습니다. 기름을 채워주세요");
			return false;
		}
		
		System.out.println(name + "는 " + speed + "로 달립니다.");
		fuel--;
		return true;
	}
	
	
	
	
	
	
	int doSomeThing(int a , int b) {
		
		if(a%2==1) {
			return -1; //리턴값을 만나면 메서드를 탈출한다. 반복문에서의 break문과 똑같다
		}
		
		System.out.println("안녕하세요~!!");
		System.out.println("반갑습니다");
		test(b);
		return a+b;
	}
	
	void test(int a) {
		if(a<10) {
			return; // 리턴값이 void일 때, return만 써서 탈출할 때 쓴다.
		}
		System.out.println("안녕");
	}
}











