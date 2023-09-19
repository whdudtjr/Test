
public class practice14 {
	public static void main(String[] args) {
//		863은 소수 인가?
//				(소수는 1과 자신이외의 정수로 나누어지지 않는 수)
		int count = 0;
		int num = 863;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
					count++;
			}
		}
		if (count == 2) {
			System.out.println(num+ "은 소수입니다.");
		}
		
	}
}
