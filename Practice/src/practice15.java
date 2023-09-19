
public class practice15 {

	public static void main(String[] args) {
		// 2~100사이의 소수를 구해보자
		int i = 0;
		int j = 0;
		for(i = 2; i < 100; i++) {
			int count = 0;
			for(j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i);
			}
		}
	}
		
}

