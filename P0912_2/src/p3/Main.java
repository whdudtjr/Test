package p3;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		AAA a1 = new AAA();
		
		int rrr = a1.minus(4, 7);
		System.out.println(rrr);
		
		try {
		int result = a1.plus(2, 2);
		System.out.println(result);
		}catch(Exception e) {
			System.out.println("안 된대,,," + e.getMessage());
		}
		System.out.println("프로그램 종료");		
	}

}

class AAA{
	//checked 예외 Exception 하위,,,
	public int plus(int a, int b) throws StmSomeException {
		
		if(a%2==0) {
			throw new StmSomeException();		
		}
		
		return a+b;
	}
	//unchecked 예외
	public int minus(int a, int b) {
		if(a%2==0) {
			throw new RuntimeException("야호");
		}
		return a-b;
	}
}

class StmSomeException extends Exception{
	
}
