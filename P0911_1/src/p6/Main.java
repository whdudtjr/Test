package p6;

public class Main {

	public static void main(String[] args) {
		// Wrapper class 웬만하면 쓰지말자
		// 특히,,, 절대 쓰지 말아야될 경우: 연산하는 경우
		// 그럼 언제 사용?: null값이 필요할 때, 단순 값 저장 
		// =>  Wrapper class 사용 도중 만약 연산이 필요하다면 언박싱부터 하고 하자
		
		//ex)
		Integer inputValue = 1;
		int value = inputValue;
		value++;
		
		// 아래 코드는 박싱, 언박싱이 계속 발생
		Integer sum = 0;
		for(Integer x = 0; x < 10; x++) {
			sum += x;
		}
		System.out.println(sum);

	}

}
