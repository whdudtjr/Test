package p3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//동기식
//		new SomeThread("안녕").run();
//		new SomeThread("반갑").run();
//		new SomeThread("hello").run();
//		
//		for(int x = 0; x < 1000; x++) {
//			System.out.println("메인" + "]" + x);
//		}
		
		
		//비동기식
		new SomeThread("안녕").start();
		new SomeThread("반갑").start();
		new SomeThread("hello").start();
		
		for(int x = 0; x < 1000; x++) {
			System.out.println("메인" + "]" + x);
		}
		
	}

}

class SomeThread extends Thread{
	
	private String name;
	public SomeThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int x = 0; x < 1000; x++) {
			System.out.println(name + "]" + x);
		}
	}
}