package p1;

public class Main {

	public static void main(String[] args) {
		// exception...
		System.out.println("안녕하세요");
		
		int inputValue = 0;
		
		try {
			int a = 10/inputValue;
		}catch(ArithmeticException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
		
		
		try{
			String str = null;
			str.charAt(inputValue);
		}catch(NullPointerException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
		
		try {
			String str = null;
			int a = 10/inputValue;
			str.charAt(inputValue);
		}catch(Exception e) {
			//System.out.println("예외 발생: " + e.getMessage());
			e.printStackTrace();// 앞으로는 이렇게 찍고 끝낼꺼임
		}
		
		System.out.println("반갑습니다.");

	}

}
