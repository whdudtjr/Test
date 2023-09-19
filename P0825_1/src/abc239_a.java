import java.util.*;
import java.lang.Math;
public class abc239_a {

	public static void main(String[] args) {
		// 땅 위 x미터 지점에서 보이는 지평선이 √{x(12800000+x)}미터  
		// 떨어진 곳이라고 가정하면, 땅 위 H미터 지점에서 보이는 지평선은 몇 미터 떨어져 있는지 구하라.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 값 > ");
		int h = scn.nextInt();
	
		double result = Math.sqrt((double)h*(12800000+h));
		System.out.printf("%.9f",result);
	}

}
