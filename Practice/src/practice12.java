
public class practice12 {

	public static void main(String[] args) {
		// 구구단의 짝수 단(2, 4, 6, 8단)만 출력하는 프로그램을 작성하되, 
//		2단은 2X2까지, 4단은 4X4까지, 6단은 6X6까지 8단은 8X8까지만 출력하도록 구현하자.
		
		
			for(int i = 2; i <= 9; i++) {
				if(i % 2 == 0) {
					for(int j = 1; j <= i; j++) {
						System.out.println(i + "x" + j + "=" + i*j);
				}
			}
		}
	}

}
