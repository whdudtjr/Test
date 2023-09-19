package p4;

public class Main {

	public static void main(String[] args) {
		// 쓰레드 사용(병렬 처리, 비동기) 
		// => 동시에 같은 메모리를 조작하는 경우 매우 위험
		// => 동기화 처리 (여러 형태)
		// => 병목 현상 발생 => 동기화 처리는 최소한이 되어야한다.
		
		
		
		new SomeThread().start();
		new SomeThread().start();
		new SomeThread().start();
		new SomeThread().start();
		new SomeThread().start();
		
	}

}

class SomeThread extends Thread{
	public void run() {
		
		for(int x = 0; x < 1000; x++) {
			long result = Data.plus(1);
			//System.out.println(result);
		}
	}
}

class Data{
	private static long value = 0;
	
	public static synchronized long plus(long temp){
		String result = value + "->"; 
		int sum = 0;
		for(int x = 0; x < 10; x++) {
			sum = sum%3 + sum + 1;
	
		}
		
		for(int x = 0; x < 10; x++) {
			sum = sum%3 + sum + 1;
	
		}
		value += temp;
		result += value;
		System.out.println(result);
		return value;
	}
}