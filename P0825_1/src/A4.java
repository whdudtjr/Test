import java.util.*;
public class A4 {

	public static void main(String[] args) {
		// 문제 설명
		// 세계적으로 권위가 있는 대회로 정기적으로 열리는 앳코더 그랜드 콘테스트(AGC)는 지금까지 54번 열렸다.
		//
		// 당신이 지금 있는 230번째 ABC가 ABC230이라고 불리는 것처럼, N번째 AGC는 처음에 0으로 패딩된 3자리 숫자 N으로 명명된다. (1번째 AGC는 AGC001, 2번째 AGC는 AGC002, ...)
		//
		// 그러나 가장 최근의 54번째 AGC는 AGC055로 불리며, 이 숫자는 54보다 1 더 크다. AGC042는 사회적 상황으로 인해 취소되어 누락되어, 42번째 이후의 콘테스트에는 개최 콘테스트 수보다 하나 더 큰 번호가 할당된다. (샘플 입력 및 출력의 설명도 참조하라.)
		//
		// 문제는 다음과 같다. 정수 N이 주어지면, N번째 AGC의 이름을 AGCXXX 형식으로 인쇄하라. 여기서 XXX는 0으로 패딩된 3자리 숫자이다.

		
		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력: > ");
		String inputValue = scn.nextLine();
		System.out.println("입력받은 값: " + inputValue);
		String [] inputs = inputValue.split(" ");
		
		int num = Integer.parseInt(inputs[0]);
		while(true) {
			if (num >= 55) {
				break;
			}
			if(num >= 19) {
				System.out.println("AGC0" + (num + 1));
				break;
			}
			System.out.println("AGC0"+num);
			break;	
		}
	}
}
