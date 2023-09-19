
public class P7 {

	public static void main(String[] args) {
		// 단항 연산자
		
		int a = 10;
		a++;
		a++; //정답
		
		System.out.println(a);

		a = 10;
		++a; //사실상 안 씀 
		System.out.println(a);
		
		
		// 시험용 틀리라고 내는 문제
		int c = 10;
		int d = 10;
		System.out.println(c);
		System.out.println(d);
		
		int result = ++c + d++;
		System.out.println(result);
		
		System.out.println(c);
		System.out.println(d);

	}

}
