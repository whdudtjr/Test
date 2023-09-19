import java.util.*;
public class Pasta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("1행 값 입력 > ");
		String inputValue = scn.nextLine();
		String[] inputList = inputValue.split(" ");
		
		int n = Integer.parseInt(inputList[0]);
		int m = Integer.parseInt(inputList[1]);
	
		System.out.print("2행 값 입력 > ");
		inputValue = scn.nextLine();
		String[] input1List = inputValue.split(" ");
		
		int[] aList = new int[n];
		for(int x = 0; x < n; x++) {
			aList[x] = Integer.parseInt(input1List[x]);
		}
		
		System.out.print("3행 값 입력 > ");
		inputValue = scn.nextLine();
		String[] input2List = inputValue.split(" ");
		
		int[] bList = new int[m];
		for(int x = 0; x < m; x++) {
			bList[x] = Integer.parseInt(input2List[x]);		
		}	
			
		// 알고리즘
		int count = 0;	
		for(int x=0; x < bList.length; x++) {
			for(int y = 0; y < aList.length; y++) {
				if(bList[x] == aList[y]) {
					aList[y] = 0;
					count++;
					break;
				}
			}
		}		
		if(count == 2) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}
