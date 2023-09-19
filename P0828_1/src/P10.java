
public class P10 {

	public static void main(String[] args) {
		// 참조 주소,,,
		
		String str1 = "안녕하세요";
		String str2 = "안녕하세요";
		
		System.out.println(str1);
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}

}
