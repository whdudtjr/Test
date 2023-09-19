
import java.util.Scanner;
public class practice22 {
	// 시각
//	• 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는
//	모든 경우의 수를 구하는 프로그램을 작성하세요. 예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되
//	어 있으므로 세어야 하는 시각입니다.
//	   • 00시 00분 03초
//	   • 00시 13분 30초
//	• 반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안 되는 시각입니다.
//	   • 00시 02분 55초
//	   • 01시 27분 45초


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
	
		
		System.out.print("a을 입력하세요:");
		int hour = scanner.nextInt();
		

		int minute = 0;
		int second = 0;
		int count = 0;
		int i = 0;
	
		while(true) {
			for(i = 0; i <= hour; i++) {
				for(minute = 0; minute <= 59; minute++) {
					for(second = 0; second <= 59; second++) {
						if(i % 10 == 3 || i / 10 == 3) {
							System.out.println(i+"시"+minute+"분"+second+"초");
							count++;
						}else if(minute % 10 == 3 || minute / 10 == 3) {
							System.out.println(i+"시"+minute+"분"+second+"초");
							count++;
						}
						else if(second % 10 == 3 || second /10 == 3) {
							System.out.println(i+"시"+minute+"분"+second+"초");
							count++;
						}
					}
				}	
			}
			break;	
		 }
		System.out.println(count);
		
	 }
}		
		
		
		
		
		
//		while(true) {
//			
//			for (i = 0; i<=hour; i++) {
//				if(i % 10 == 3 || i / 10 == 3) {
//					System.out.println(i+"시"+minute+"분"+second+"초");
//				}
//				for(minute = 0; minute<=59; minute++) {//문제
//					if(minute % 10 == 3 || minute / 10 == 3) {
//						for(second = 0; second <= 59; second++) {
//							System.out.println(i+"시"+minute+"분"+second+"초");
//					}
//					for(second = 0; second<=59; second++) {
//						
//						if(second % 10 == 3 || second / 10 == 3) {
//							System.out.println(i+"시"+minute+"분"+second+"초");
//						}
//					}
//					
//				}
//			}
////				
//				
//			}
//			break;
//		}

