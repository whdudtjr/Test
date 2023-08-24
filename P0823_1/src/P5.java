
public class P5 {

	public static void main(String[] args) {
		// 스택 LIFO 형식 
		// 메모리 블록{} 중요, 블록 단위로 변수의 소멸 항상 주의할 것
		int a = 10;
		int b = 10;
		{
			int c = 30;
			{
				int d = 40;
				int e = 50;
				System.out.println(d);
				System.out.println(e);
			}
			{
				int f = 60;
				System.out.println(f);
			}
			System.out.println(c);
		}
		int g = 70;
		System.out.println(a);
		System.out.println(b);
		System.out.println(g);
	}	

}
