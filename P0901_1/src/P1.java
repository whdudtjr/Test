
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		
		Test1 t1 = new Test1();
		t1.do1(a);
		
		System.out.println("프로그램 종료"); 
	}

}


class Test1{
	
	void do1(int a) {
		
		System.out.println("do1 호출");
		do2(a);
	}
	
	void do2(int a) {
		System.out.println(a);
		System.out.println("do2 호출");
	}
	
}