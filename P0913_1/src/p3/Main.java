package p3;
		
public class Main {
		
	public static void main(String[] args) {
		// 람다식(문법)
		// 인터페이스에 추상화 메서드가 하나만 있을 때 가능	
		// 구현하고자하는 내용이 최대한 적을 때 (추천)
		Testable t1 = new Some1();
		//...
		//최대한 사용한 것
		Testable t2 = (a,b) -> {
			System.out.println(a);
			System.out.println(b);
			return a+b;
		};
		
		int result = t2.plus(2,3);
		System.out.println(result);
		System.out.println("프로그램 종료");
	}			
}		

interface Testable{
	public int plus(int a, int b);
}

class Some1 implements Testable{
	public int plus(int a, int b) {
		return a+b;	
	}	
}		
		
