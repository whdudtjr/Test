
public class practice17 {

	public static void main(String[] args) {
//		int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라. 
//		만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. 
//		[주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
//		(API를 사용하지 않는다. 알고리즘으로만 처리)
		
		int num = 12345;
		int sum = 0;
		int temp = 0;
		for( ; ;) {
			temp = num % 10;
			sum += temp;
			num = num / 10;
			if(num <= 0) {
				System.out.println(sum);
				break;
			}
		}
		

	}

}
