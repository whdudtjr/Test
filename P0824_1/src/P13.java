
public class P13 {

	public static void main(String[] args) {
		// 구구단
		// for ( ; ;) //무한반복
		// for(int x = 1, y =2; x == 1; x++, y--,System.out.println("안녕"))
		// for문에 중괄호 안 치면 밑에 한 줄만 출력됨
		for(int x = 2; x <= 9; x++) {
			for(int y = 1; y <= 9; y++) {
				int result = x * y;
				System.out.println(x + "x" + y + "=" + result);
			}
		}

	}

}
