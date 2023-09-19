import java.util.*;
public class A3 {

	public static void main(String[] args) {
//		A - 수압 
//
//		문제 설명
//		수압은 깊이에만 좌우되며, x미터 깊이에서 x/100메가파스칼이라고 가정하자.
//		수심 D미터의 수압은 몇 메가파스칼인가?

		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력: > ");
		String inputValue = scn.nextLine();
		System.out.println("입력받은 값: " + inputValue);
		String [] inputs = inputValue.split(" ");
		
		int x = Integer.parseInt(inputs[0]);
		
		System.out.println((double)x/100);
		
		
	}

}
