import java.util.regex.Pattern;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "qwersfg";
		
		for(int x = 0; x < str1.length(); x++) {
			char s = str1.charAt(x);
		}
		
		// 정규표현식
		String inputPassword = "qweqr11112233";
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&*!])[A-Za-z\\d@#$%^&*!]{8,}$";
		
		if(Pattern.compile(regex).matcher(inputPassword).matches()) {
			System.out.println("사용 가능한 비밀번호입니다.");
		}else {
			System.out.println("영문...숫자...8글자 이상,,이어야 합니다.");
		}
		
		//...
		int a = 8;
		int b = 7;
		
		String result = a + "X" + b + "=" + (a*b);
		System.out.println(result);
		
		String result2 = String.format("%d x %d = %d", a,b,a*b);
		System.out.println(result2);
		//%? : ?만큼 띄어쓰기 , %.? : ?까지 소수점 나타내기
		String result3 = String.format("%d 안녕 %5.1f 야호 %s",1,3.3,"헬로우");
		System.out.println(result3);
		
		System.out.println(String.join("","안녕","반갑","ㅎㅎㅎㅎ"));

		String d = String.valueOf(50);
		System.out.println(d);
	}

}
