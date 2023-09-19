
public class P3 {

	public static void main(String[] args) {
		// + : 문자열 연산
		// 피연산자 중에 하나라도 문자열이 있으면 문자열로 계산함
		String s1 = "안녕하세요";
		String s2 = "반갑습니다";
		
		String result = s1 + s2;
		System.out.println(result);
		
		int a1 = 10;
		int a2 = 3;
		
		String r1 = s1 + a1;
		System.out.println(r1);
		
		String r2 = s1 + a1 + a2;
		System.out.println(r2);
		
		String r3 = s1 + (a1 + a2);
		System.out.println(r3);
		
		String r4 = s1 + (a1 * a2);
		System.out.println(r4);
	}

}
