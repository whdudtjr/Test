package p6;

public class Main {

	public static void main(String[] args) {
		// 
		TTT t1 = (a) -> {
			System.out.println(a);
		};
		
		TTT t2 = a ->{
			System.out.println(a);
		};
		// 리턴값이 없을 때, 한 줄일 때, 소괄호,중괄호 없애는거 가능
		TTT t3 = a -> System.out.println(a);
		
		// 메서드 참조
		TTT t4 = System.out::println;
		
		t4.test(50);
	
		
	}

}
interface TTT{
	public void test(int a);
}
