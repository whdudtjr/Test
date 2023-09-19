
public class P3 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*10) + 10; //0~1미만의 실수 값이 나온다
		System.out.println("a의 값:" + a);
	
		if(a % 2 == 0) {
			System.out.println(a + "는 짝수입니다");
		}else {
			System.out.println(a + "는 홀수입니다");
		}
		
	}
	

}
