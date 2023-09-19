package p1;

public class Main {

	public static void main(String[] args) {
		// 쓰레드... 비동기식
		// 쓰레드 API
		Test t1 = new Test();
		//t1.run();//이건 그냥 호출
		t1.start();//쓰레드 생성해서 run을 호출함
		
		Test t2 = new Test();
		//t1.run();//이건 그냥 호출
		t2.start();//쓰레드 생성해서 run을 호출함, 서브 쓰레드
		
		//메인 쓰레드
		System.out.println("야호");

	}

}

class Test extends Thread{
	
	//예제 run 메서드가 쓰레드 메서드
	public void run() {
		System.out.println("안녕하세요!!!!");
	}
	
	public void rrr() {
		System.out.println("안녕");
	}
	
}