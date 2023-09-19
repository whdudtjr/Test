package p5;

public class Main {

	public static void main(String[] args) {
		// 람다식..
		TTT t1 = a -> Math.incrementExact(a);
		
		// 메서드 참조...
		TTT t2 = Math::incrementExact;
		System.out.println(t2.some(10));
	}

}
interface TTT{
	public int some(int a);
}

