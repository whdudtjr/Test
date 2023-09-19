package p9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA<String,Integer,Character> a1 = new AAA<String,Integer,Character>();
		a1.v1 = "안녕하세요";
		a1.v2 = 10;
		a1.v3 = 'a';
		
	}

}
class AAA<Q,T,R>{
	Q v1;
	T v2;
	R v3;
	int v4;
}