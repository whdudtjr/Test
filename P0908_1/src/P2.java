
public class P2 {

	public static void main(String[] args) {
		// 가벼운 API
		// String - 인스턴스가 생성되는 클래스
		String str1 = "안녕하세요";//참조 주소가 들어간다
		String str2 = "안녕하세요";//str1 과 str2는 같은 주소값
		String str3 = new String("안녕하세요");
		
		//리턴 타입이 void 일 때는 변수에 바로 반영 - 가변 객체
		String str4 = "Hello, 안녕, LOW";
		System.out.println(str4);
		//리턴 타입이  String일 때, 새로운 변수를 만든 뒤 반영 - 불변 객체
		String str5 = str4.concat("edd");
		System.out.println(str5);
		//새로운 변수를 만들기 싫다면 원래 변수에 넣어줌
		str4 = str4.concat("edd");
		System.out.println(str4);
		
		//charsequence를 넣어야 하지만 다형성으로 인해 string 가능
		if(str4.contains("ell")) {
			System.out.println("포함");
		}
		
		int result = str4.compareTo("I");
		System.out.println(result);
		
		if(str4.equals("안녕")) {
			
		}
		
		if("안녕".equals(str4)) {
			
		}
		String a = "";//null은 주소값이 없는것, ""은 힙메모리에 주소가 만들어지는데 값은 0 
		if(a.isEmpty()) {
			
		}
		String a2 = "   ";
		if(a2.isBlank()) {
			
		}
		int e = str4.length();
		
		str4 = str4.replaceAll("ell", "야호");
		System.out.println(str4);
		
		boolean b = str4.startsWith("H");
		System.out.println(b);
		//offset: 배열의 몇번째부터~...
		//처음부터 찾는다
		int n = str4.indexOf(",");
		System.out.println(n);
		//마지막부터 찾는다
		int n1 = str4.lastIndexOf(",");
		System.out.println(n1);
		
		String[] a4 = str4.split(",");
		
		str4 = str4.substring(5);
		System.out.println(str4);
		
		String filename = "qwerfwefwfelwf.awdadawdr.jpg";
		// 질문: 확장자명을 출력하세요.
		String ext = filename.substring(filename.lastIndexOf("."));
		System.out.println(ext);
		
		String searchWord = "  아이유   ";
		System.out.println(searchWord);
		searchWord = searchWord.trim();
		System.out.println(searchWord);
		
		searchWord = "hello";
		if(searchWord.toLowerCase().equals("hello".toLowerCase())) {
			
		}
		
		//메소드 체이닝
		str4.trim().trim().trim();
		
		// 아래는 메소드 체이닝 아님 - 안쪽부터
		str4.lastIndexOf((int)Math.random());
	
		//예제
		str4.trim().trim().substring(str4.lastIndexOf(0)).trim();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}