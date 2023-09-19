package p3;

public class Main {

	public static void main(String[] args) {
		// Object hashcode
		
		
		String str1 = "안녕하세요";
		int code1 = str1.hashCode();
		System.out.println(code1);
	
		String str2 = "안녕하세요";
		int code2 = str2.hashCode();
		System.out.println(code2);
		
		if(str1.equals(str2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}

	}

}
