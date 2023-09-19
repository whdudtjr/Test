import java.util.*;
public class abc234_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력 > ");
		String inputValue = scn.nextLine();
		String[] inputs = inputValue.split(" ");
		
		int t = Integer.parseInt(inputs[0]);
		int inputRight = 0;
		int inputLeft = 0;
		
		int left1 = (t*t + 2*t + 3) + t;
		int left2 = left1*left1 + 2*left1 + 3;
		
		int right1 = t*t + 2*t + 3;
		int right2 = right1*right1 + 2*right1 + 3;
		
		int total = left2 + right2;
		
		int result = total * total + 2*total + 3;
		
		System.out.println(result);
	}

}
