import java.util.*;
public class abc249_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력: > ");
		String inputValue = scn.nextLine();
		String[] arr = inputValue.split("");
		int value = 0;
		boolean isPrime1 = false;
		boolean isPrime2 = false;
		boolean isPrime3 = false;
		
		for(int x = 1; x < inputValue.length(); x++) {// 0 1 2 3 4
			for(int y = 0; y < x; y++) {// 
				if(arr[y].equals(arr[x])) {
					isPrime1 = true; // 같다
					break;
				}
			}
		}
		

		for(int i = 0; i < inputValue.length(); i++) {
			value = inputValue.charAt(i);
			if(value >= 97 && value <= 122) {
				isPrime2 = true;
			}
			if(value >= 65 && value <= 90) {
				isPrime3 = true;
			}
		}
		
		
		if(isPrime1 == true || (isPrime2 && isPrime3 == false)) {
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
