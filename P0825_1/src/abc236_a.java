import java.util.*;
public class abc236_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("1행 값 > ");
		
		String inputValue = scn.nextLine();
		String[] s = inputValue.split("");
		
		System.out.print("2행 값 > ");
		String input1Value = scn.nextLine();
		String[] input1List = input1Value.split(" ");
		
		int a = Integer.parseInt(input1List[0]);
		int b = Integer.parseInt(input1List[1]);
		int value = 0;
		
		String temp = null;
		
		String[] aList = new String[s.length];
		for(int x = 0; x < s.length; x++) {
			if(x == a-1) {
				temp = s[a-1];
				s[a-1] = s[b-1];
				s[b-1] = temp;
			}
			aList[x] = s[x];
			System.out.print(aList[x]);
		}
		
	}

}
