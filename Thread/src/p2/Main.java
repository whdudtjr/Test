package p2;

public class Main {

	public static void main(String[] args) {
		// 쓰레드를 생성하는 2가지 방법: Thread 클래스 상속(선호함), Runnable 인터페이스 상속
		
		new Some1().start();
		new Thread(new Some2()).start();

	}

}
//1
class Some1 extends Thread{
	public void run() {
		//...실행 내용...
	}
}

//2
class Some2 implements Runnable{
	public void run() {
		//...실행 내용...
	}
}


