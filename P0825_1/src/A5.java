import java.util.*;
public class A5 {

	public static void main(String[] args) {
		// A - 10엔짜리 우표 

//문제 설명
//다카하시는 산타클로스에게 편지를 보내고 싶다. 그에게는 X엔(일본 통화)짜리 우표가 붙은 봉투가 있다. 
//편지가 산타클로스에게 배달되려면, 봉투에 적어도 총 Y 엔 이상의 우표가 붙어있어야 한다.
//다카하시는 전체 우표의 값이 적어도 총 Y 엔이 되도록 봉투에 10엔짜리 우표를 몇 장 더 붙이려고 한다. 
//다카하시는 봉투에 10엔짜리 우표를 최소한 몇 장 더 붙여야 하는가?

		Scanner scn = new Scanner(System.in);
		System.out.print("갑 입력: > ");
		String inputValue = scn.nextLine();
		System.out.println("입력받은 값: " + inputValue);
		String [] inputs = inputValue.split(" ");
		
		int x = Integer.parseInt(inputs[0]);
		int y = Integer.parseInt(inputs[1]);
		int count = 0;
		
		while(true) {
			if(x<=y) {
				x += 10;
				count++;
				if(x>=y) {
					System.out.println(count);
					break;
				}
			}else {
				System.out.println(count);
				break;
			}	
		}	
	}
}
