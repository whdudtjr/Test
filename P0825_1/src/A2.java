import java.util.*;
public class A2 {

	public static void main(String[] args) {
		// 다카하시는 매일 S시(24시간제)에 자신의 방의 불을 켜고, 매일 T시에 불을 끈다.
//		불이 켜져 있는 동안 날짜가 변경될 수 있다.
//
//		X시 30분에 불이 켜져 있는지 구하라.
//		출력
//		X시 30분에 불이 켜져 있으면 Yes를 인쇄하고, 그렇지 않으면 No를 인쇄한다.

		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력 > ");
		String inputValue = scn.nextLine();
		System.out.println("입력 받은 값: " + inputValue);
		String [] inputs = inputValue.split(" ");
		
		int onHour = Integer.parseInt(inputs[0]);
		int offHour = Integer.parseInt(inputs[1]);
		int result = Integer.parseInt(inputs[2]);

		int temp = 0;
		
		
		if(onHour == 23) {
			temp = onHour;
			onHour = offHour;
			offHour = temp;
		}
		
		if((onHour > offHour) && (result < offHour)) {
			System.out.println("yes");
		}else if(result >= onHour && result <= offHour) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
//		int i = 0;
//		int temp = 0;
//		while(i<48) {
//			temp = i % 24;
//			System.out.println(temp);
//			i++;
//		}
	}

}
