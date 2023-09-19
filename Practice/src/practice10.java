
public class practice10 {

	public static void main(String[] args) {
//		자연수 1부터 시작해서 모든 홀수와 3의 배수인 짝수를 더해 나간다. 
//		그 합이 언제(몇을 더했을 때) 1000을 넘어서는지 , 그리고 1000을 넘어선 값은 얼마가 되는지 계산하여 출력하는 프로그램을 작성해 보자.
		int sum = 0;
		for (int i = 1; ; i++) {
			if(i % 2 != 0 || i % 6 == 0) {
				sum += i;
			}
			if(sum > 1000) {
				System.out.println(i);
				System.out.println(sum);
				break;
			}
		}



	}

}
