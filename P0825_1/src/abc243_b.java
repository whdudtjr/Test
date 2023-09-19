import java.util.*;
public class abc243_b {

	public static void main(String[] args) {
		// 각 길이가 N: A=(A1,A2,…,AN)및 B=(B1,B2,…,BN)인 정수열이 제공된다.
//		A의 모든 요소는 서로 다르며, B의 모든 요소도  서로 다르다.
//
//		다음의 두 값을 인쇄하라.
//		1. A와 B에 모두 포함되며, 두 수열에서 동일한 위치에 나타나는 정수의 개수. 즉, 정수의 개수i는 Ai=Bi.
//		2. A와 B에 모두 포함되며, 두 수열에서 서로 다른 위치에 나타나는 정수의 개수. 즉, 정수쌍(i,j)의 개수i는 Ai=Bi 및 i≠j.

		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 행 입력 > ");
		String inputValue = scn.nextLine();
		int n = Integer.parseInt(inputValue);
		
		System.out.println("두번째 행 입력 > ");
		String value1 = scn.nextLine();
		String[] value1List = value1.split(" ");
		
		int[] aList = new int[n];
		for(int x = 0; x < n; x++) {
			aList[x] = Integer.parseInt(value1List[x]);
		}
		
		System.out.println("세번째 행 입력 > ");
		String value2 = scn.nextLine();
		String[] value2List = value2.split(" ");
		
		int[] bList = new int[n];
		for(int x = 0; x < n; x++) {
			bList[x] = Integer.parseInt(value2List[x]);
		}
		
		// 로직 구현
		// 동일한 위치에 같은 값이 나오는 갯수
		int firstCount = 0;
		for(int x = 0; x < n; x++) {
			if(aList[x]==bList[x]) {
				firstCount++;
			}
		}
		
		int secondCount = 0;
		for(int x = 0; x < n; x++) {
			for(int y = 0; y < n; y++){
				if(x != y && aList[x] == bList[y]) {
					secondCount++;
				}
			}
		}
		System.out.println(firstCount);
		System.out.println(secondCount);
	}

}
