import java.util.*;
public class A9 {

	public static void main(String[] args) {
		// 다카하시의 집에는 다카하시, 그의 아버지, 그의 어머니, 이렇게 3명이 살고 있다. 그들 모두는 매일 밤 화장실에서 머리를 감는다.
//		아버지, 어머니, 다카하시의 차례로 목욕을 하고, 각각 A, B, C 밀리리터의 샴푸를 사용한다.
//		오늘 아침, 그 병에는 V 밀리리터의 샴푸가 들어있었다. 리필하지 않고, 머리를 감을 샴푸가 가장 먼저 부족하게 될 사람은 누구인가?
		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력: > ");
		String inputValue = scn.nextLine();
		System.out.println("입력 받은 값: " + inputValue);
		String [] inputs = inputValue.split(" ");
		
		int totalShampoo = Integer.parseInt(inputs[0]);
		int fatherUseShampoo = Integer.parseInt(inputs[1]);
		int motherUseShampoo = Integer.parseInt(inputs[2]);
		int takahasiUseShampoo = Integer.parseInt(inputs[3]);
		
		while(true) {
			totalShampoo = totalShampoo - fatherUseShampoo;
			if (totalShampoo < 0) {
				System.out.println("F");
				break;
			}
			totalShampoo = totalShampoo - motherUseShampoo;
			if (totalShampoo < 0) {
				System.out.println("M");
				break;
			}
			totalShampoo = totalShampoo - takahasiUseShampoo;
			if (totalShampoo < 0) {
				System.out.println("T");
				break;
			}
		}
	}
}
