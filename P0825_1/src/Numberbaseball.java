import java.util.*;
public class Numberbaseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("1행 값 입력 > ");
		String inputValue = scn.nextLine();
		String[] inputList = inputValue.split(" ");
		
		int n = Integer.parseInt(inputList[0]);
		
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
		
		int[] bList = new int[n];
		for(int x = 0; x < n; x++) {
			bList[x] = Integer.parseInt(input2List[x]);
		}
		int firstCount = 0;
		int secondCount = 0;
		for(int x = 0; x < bList.length; x++) {
			for(int y = 0; y < aList.length; y++) {
				if((x==y)&&(bList[x] == aList[y])) {
					aList[y] = 0;
					firstCount++;
				}
				if(bList[x] == aList[y]) {
					aList[y] = 0;
					secondCount++;
				}
			}
		}
		System.out.println(firstCount);
		System.out.println(secondCount);
	}

}
