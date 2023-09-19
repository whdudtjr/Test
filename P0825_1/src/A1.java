import java.util.*;

public class A1 {

	public static void main(String[] args) {
		// A - 조깅
		// 알고리즘 문제 스타트 - 입력 받기 API
		Scanner scn = new Scanner(System.in);
		
		System.out.print("값 입력 > ");
		String inputValue = scn.nextLine();//문자열
		System.out.println("입력 받은 값 : " + inputValue);

		String [] inputs = inputValue.split(" ");
		
//		int a = Integer.parseInt(inputs[0]);
//		int b = Integer.parseInt(inputs[1]);
//		int c = Integer.parseInt(inputs[2]);
//		int d = Integer.parseInt(inputs[3]);
//		int e = Integer.parseInt(inputs[4]);
//		int f = Integer.parseInt(inputs[5]);
//		int x = Integer.parseInt(inputs[6]);
//		
//		int takahasi;
//		int aoki;
//		int takahasiSpeed = 0;
//		int aokiSpeed = 0;
//		//위에까지 - 세팅
//		//여기부터 알고리즘 구현
//		for(int start = 0; start <= x; start++) {
//			
//			for(takahasi = 0; takahasi <= a; takahasi++) {
//				takahasiSpeed = b*a;
//			}
//			for(int j = 0; j <= c; j++) {
//				takahasiSpeed += 0;
//			}
//			// takahasi
//			for(aoki = 0; aoki <= d; aoki++) {
//				aokiSpeed = e*d;
//			}
//			for(int j = 0; j <= f; j++) {
//				aokiSpeed += 0;
//			}	
//			// aoki
//		}
//		
//		if(takahasiSpeed > aokiSpeed) {
//			System.out.println("Takahasi");
//		}else if(takahasiSpeed < aokiSpeed) {
//			System.out.println("Aoki");
//		}else {
//			System.out.println("Draw");
//		}
//	}
//
//}
		int tMaxRun = Integer.parseInt(inputs[0]);
		int tSpeed = Integer.parseInt(inputs[1]);
		int tMaxRest = Integer.parseInt(inputs[2]);
		int aMaxRun = Integer.parseInt(inputs[3]);
		int aSpeed = Integer.parseInt(inputs[4]);
		int aMaxRest = Integer.parseInt(inputs[5]);
		int runTime = Integer.parseInt(inputs[6]);
		
		int tDistance = 0;
		int aDistance = 0;
		
		int tLeftRun = tMaxRun;//타카와시의 걷는 시간을 tleftrun 에 대입
		int tLeftRest = 0;
		int aLeftRun = aMaxRun; // 아오키의 걷는 시간을 tleftRun에 대입
		int aLeftRest = 0;
		
		
		for(int x = 0; x < runTime; x++) { // 총 시간동안 반복
			if(tLeftRun > 0) { // 타카와시가 걷는 시간이 끝날 때까지 반복 
				tDistance += tSpeed; // 타카와시의 거리에 스피드를 더해줌
				tLeftRun--; // 타카와시의 걷는 시간이 담겨 있는 tleftrun 감소
				if(tLeftRun == 0) { // 만약 tlefrun 이 0이면
					tLeftRest = tMaxRest; // 총 휴식시간을 남아있는 휴식시간에 대입
				}
			}else { // 타카와시가 걷는 시간이 끝났을 때
				tLeftRest--; // 총 휴식 시간이 감소 
				if(tLeftRest == 0) { // 총 휴식 시간이 끝났을 때
					tLeftRun = tMaxRun; // 총 걷는 시간이 tleftrun으로 대입
				}
			}
			if(aLeftRun > 0) {
				aDistance += aSpeed;
				aLeftRun--;
				if(aLeftRun == 0) {
					aLeftRest = aMaxRest;
				}
			}else {
				aLeftRest--;
				if(aLeftRest == 0) {
					aLeftRun = aMaxRun;
				}
			}	
			
		}
		
		if(tDistance > aDistance) {
			System.out.println("takahasi");
		}else if(tDistance < aDistance) {
			System.out.println("aoki");
		}else {
			System.out.println("draw");
		}
	}
}


















