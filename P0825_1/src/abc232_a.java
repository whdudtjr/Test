import java.util.*;
public class abc232_a {

	public static void main(String[] args) {
		// 1과 9(포함) 사이의 정수 a와 b, 그리고 x를 axb의 순서로 연결한 3자로 이루어진 문자열 S가 주어진다.
		// a와 b의 곱을 구하시오.
		Scanner scn = new Scanner(System.in);
		System.out.print("값 입력 > ");
		String inputValue = scn.nextLine();
		String[] inputs = inputValue.split("");
		
		
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[2]);
		
		int result = a*b;

		System.out.println(result);
	}
}
