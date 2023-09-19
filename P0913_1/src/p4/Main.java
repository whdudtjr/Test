package p4;

public class Main {

	public static void main(String[] args) {
		// 람다식,,인터페이스 매개변수가 하나인 경우
		TTT t1 = (a) ->{
			return a + 3;
		};
		
		TTT t2 = (a) -> {
			return a - 3;
		};
		
		//매개변수가 하나인 경우 소괄호 뺄 수 있다.
		TTT t3 = a->{
			return a+10;
		};
		
		//구현 코드가 단 한줄인 경우,,,리턴해야되는 경우,,중괄호를 뺄 수 있다.
		TTT t4 = a-> a+5;
		
		
		System.out.println(t1.some(5));
		System.out.println(t2.some(5));
	}

}
interface TTT{
	public int some(int a);
}
