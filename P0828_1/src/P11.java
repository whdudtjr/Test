
public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String 배열은 주소값을 비교
		//그래서 String 배열 안에 들어가있는 값 비교는 무조건 api를 사용해야 함
		String str1 = new String("안녕하세요");
		String str2 = new String("안녕하세요");

		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		//정답: 문자열 비교시에는 equals 메소드 사용{API)
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
