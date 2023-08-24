
public class P4 {

	public static void main(String[] args) {
		// 모든 지역 변수(갈색)는 스택에 생성된다.
		// 스코프(블럭{})을 빠져나가면 소멸됨.
		// 메모리의 생성과 소멸
		// 블록 단위로 메모리 생성과 소멸
		
		int bbb = 20;
		
		{
			int aaa = 10;
			aaa = 20;
		}
		
		int aaa = 30;
		
	}

}
