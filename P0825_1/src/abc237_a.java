import java.util.*;
public class abc237_a {

	public static void main(String[] args) {
		// 정수 N이 주어진다. 
		// N이 -231과 231-1(포함) 사이에 있으면 Yes를 인쇄하고, 
		// 그렇지 않으면 No를 인쇄하라.

		Scanner scn = new Scanner(System.in);
		System.out.print("입력 값 > ");
		long n = scn.nextLong();
		long result = 1;
		for(int i = 0; i < 31; i++) {
			result *= 2;
		}
		
		if(n > -(result) && n <= (result)-1) {
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}
}
