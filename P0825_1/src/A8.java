import java.util.*;
public class A8 {

	public static void main(String[] args) {
		// A - 좋은 아침

//문제 설명
//어느 날, 다카하시가 정확히 A시 B분(24시간제)에 일어났고, 아오키는 정확히 C시 D분 1초에 일어났다.
//다카하시가 아오키보다 일찍 일어나면 Takahashi를 인쇄하고, 그렇지 않으면 Aoki를 인쇄하라.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력: > ");
		String inputValue = scn.nextLine();
		System.out.println("입력 받은 값: " + inputValue);
		String [] inputs = inputValue.split(" ");
		
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int c = Integer.parseInt(inputs[2]);
		int d = Integer.parseInt(inputs[3]);
		
		if(a>c) {
			System.out.println("Aoki");
		}else if(a==c) {
			if(b>d) {
				System.out.println("Aoki");
			}else if(b==d) {
				System.out.println("Takahasi");
			}else {
				System.out.println("Takahasi");
			}
		}else {
			System.out.println("Takahasi");
		}
	}

}
