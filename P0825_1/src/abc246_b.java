import java.util.*;
public class abc246_b {

	public static void main(String[] args) {
		// 2차원 평면의 점(0,0)에서 점(A,B)을 향해 1의 거리를 이동한다. 이동 후의 좌표를 구하라.
		//점X에서 점Y까지의 거리d (d ≤ 선분XY의 길이)를 이동하면, X로부터의 거리가 d인 선분XY 위의 한 점에 위치한다.
		//제약은 (0,0)에서 점(A,B) 사이의 거리가 적어도 1이 되게 해준다.
		
		Scanner scn = new Scanner(System.in);
		System.out.print("값 입력 > ");
		String inputValue = scn.nextLine();
		String[] inputs = inputValue.split(" ");
		
		int a = Integer.parseInt(inputs[0]);
		int b = Integer.parseInt(inputs[1]);
		
		double aCoordinates = a/(double)Math.sqrt(a*a+b*b);
		double bCoordinates = b/(double)Math.sqrt(a*a+b*b);
		
		System.out.printf("%.8f",aCoordinates);
		System.out.print(" ");
		System.out.printf("%.8f",bCoordinates);
	}

}
