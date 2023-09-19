import java.util.*;
public class abc246_a {

	public static void main(String[] args) {
		// 문제 설명
//		xy평면에 직사각형이 있다. 이 직사각형의 각 모서리는 x축 또는 y축과 평행을 이루며, 면적은 0이 아니다.
//
//		이 직사각형의 네 꼭짓점 중 세 꼭짓점, (x1,y1), (x2,y2), (x3,y3)의 좌표가 주어지면, 네번째 꼭짓점의 좌표를 구하라.
//
//		제약
//		−100 ≤ xi,yi ≤ 100
//		(x1,y1), (x2,y2), (x3,y3)를 모두 꼭짓점으로 가지며, 각 모서리가  x축 또는 y축과 평행을 이루며, 0이 아닌 면적을 가지는 직사각형이 특수하게 존재한다.
//		모든 입력값은 정수이다.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("1행 값 입력: > ");
		
		String input1 = scn.nextLine();
		String[] input1List = input1.split(" ");
		
		
		int x1 = Integer.parseInt(input1List[0]);
		int y1 = Integer.parseInt(input1List[1]);
		
		
		System.out.println("2행 값 입력: > ");
		
		String input2 = scn.nextLine();
		String[] input2List = input2.split(" ");
		int x2 = Integer.parseInt(input2List[0]);
		int y2 = Integer.parseInt(input2List[1]);
		
		System.out.println("3행 값 입력: > ");
		
		String input3 = scn.nextLine();
		String[] input3List = input3.split(" ");
		int x3 = Integer.parseInt(input3List[0]);
		int y3 = Integer.parseInt(input3List[1]);
		
		if(x1 == x2) {
			System.out.print(x3+" ");
		}else if(x1 == x3) {
			System.out.print(x2+" ");
		}else {
			System.out.print(x1+" ");
		}
		if(y1 == y2) {
			System.out.print(y3);
		}else if(y1 == y3) {
			System.out.print(y2);
		}else {
			System.out.print(y1);
		}
	}

}
