import java.util.*;
public class abc241_b {

	public static void main(String[] args) {
		// 27p 파스타 문제 - 표준 입력 받는 법

		
		Scanner scn = new Scanner(System.in);
		System.out.print("1행 값 입력 > ");
		
		String input1 = scn.nextLine();
		String[] input1List = input1.split(" ");
		
		int n = Integer.parseInt(input1List[0]);
		int m = Integer.parseInt(input1List[1]);
		
		System.out.print("2행 값 입력 > ");
		String input2 = scn.nextLine();
		String[] input2List = input2.split(" ");
		
		int[] aList = new int[n];
		for(int x = 0; x < n; x++) {
			aList[x] = Integer.parseInt(input2List[x]);
		}
		
		System.out.print("3행 값 입력 > ");
		String input3 = scn.nextLine();
		String[] input3List = input3.split(" ");
		
		int[] bList = new int[m];
		for(int x = 0; x < m; x++) {
			bList[x] = Integer.parseInt(input3List[x]);
		}
		
		//알고리즘 풀이
			
		String result = "yes";
		for(int bIndex = 0; bIndex < m; bIndex++) {
			boolean isSuccess = false;
			for(int aIndex = 0; aIndex < n; aIndex++) {
				if(bList[bIndex] == aList[aIndex]) {
					aList[aIndex] = 0;
					isSuccess = true;
					break;
				}
			}
			if(!isSuccess) {
				result = "no";
				break;
			}
		}
		System.out.println(result);
	}

}
