package p2;

public class Main {

	public static void main(String[] args) {

		System.out.println("1");

		try {
			System.out.println("2");

			int a = 10/0;
			
			String str = null;
			str.trim();

			
			
			System.out.println("3");
		}catch(NullPointerException e){
			System.out.println("널 포인터 예외 발생");
			
		}catch(Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}finally {
			System.out.println("여기는 무조건 실행됨");// finally는 그 전에 return코드가 있어도 실행됨
			//자원을 닫는 용도로 쓰임
		}
		
		System.out.println("4");
	
	}

}
