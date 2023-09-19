import java.util.*;
public class abc248_a {

	public static void main(String[] args) {
		// 문제 설명
//		숫자로 구성된 길이가 정확히 9인 문자열 S가 주어진다. 0부터 9까지의 모든 숫자가 S에 정확히 한 번 나타난다.
//		S에서 누락된 유일한 숫자를 인쇄하라.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("값 입력: > ");
		String inputValue = scn.nextLine();
		char[] arr = inputValue.toCharArray();
		
		int[] newArr = new int[10];
		for(int i = 0; i < 9; i++) {
			newArr[i] = 0;
		}
		
		for(int j = 0; j < 9; j++) {
			int n = (int)arr[j];
			newArr[n-48] = 1;
		}
		
		for(int i = 0; i < 9; i++) {
			if(newArr[i] == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
//		int value = 0;
//		
//		
//		int[] arr1 = {48,49,50,51,52,53,54,55,56,57};
//		
//		String[] arr = inputValue.split("");
//		
//		for(int i = 0; i < arr.length; i++) {
//			value = inputValue.charAt(i);
//			for(int j = 0; j < arr1.length; j++) {
//				if(value == arr[j]) {
//					
//				}
//				System.out.println(arr1[j]);
//			}
//		}
		
		


	}

}
