import java.util.*;
public class abc241_a {

	public static void main(String[] args) {
		// 한 자리의 숫자가 표시되는 화면과 버튼이 있는 장치가 있다.
//		화면에 숫자 k가 표시될 때, 버튼을 한 번 누르면 화면의 숫자가 ak로 바뀐다.
//		장치에 현재 보이는 숫자는 0이다. 버튼을 3번 누른 후 화면에 보이는 숫자는 무엇인가?
		
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 값 > ");
		String input1 = scn.nextLine();
		String[] input1List = input1.split(" ");
		
		int temp =0;
		
		int[] aList = new int[11];
		for(int x = 0; x<10; x++) {
			aList[x] = Integer.parseInt(input1List[x]);	
		}
		
		temp = aList[0];
		temp = aList[temp];
		temp = aList[temp];
		System.out.println(temp);
	}
}
