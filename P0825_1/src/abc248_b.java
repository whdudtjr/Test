import java.util.*;
public class abc248_b {

	public static void main(String[] args) {
		// 슬라임 A가 있다.
//		스누크가 소리칠 때마다, 슬라임은 K배로 증가한다.
//		B 또는 그 이상의 슬라임을 가지려면, 스누크가 최소한 몇 번을 소리쳐야 하는가?
		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력 > ");
		String inputValue = scn.nextLine();
		String[] inputs = inputValue.split(" ");
		
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		int k = Integer.parseInt(inputs[2]);
		int count = 0;
		
		while(true) {
			a *= k;
			count++;
			if(a >= b) {
				break;
			}
		}
		System.out.println(count);
	}

}
