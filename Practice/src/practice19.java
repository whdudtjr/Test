
public class practice19 {

	public static void main(String[] args) {
		// 반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 
		
//		int a = 1;
//		int temp;
//		while(a<=99) {
//			int count = 0;
//			if((a / 10 == 3) || (a / 10 == 6) || (a / 10 == 9)) {
//				count++;
//			}
//			temp = a;
//			if((temp % 10 == 3)||(temp % 10 == 6)||(temp % 10 == 9)) {
//				count++;
//			}
//			
//			if(count == 1) {
//				System.out.println(temp+":"+"박수 한번");
//			}
//			if(count == 2) {
//				System.out.println(temp+":"+"박수 두번");
//			}
//			
//			a++;
//		}
		
		int a = 1;
		int temp;
		for(a=1; a<=99; a++) {
			int count = 0;
			if((a / 10 == 3) || (a / 10 == 6) || (a / 10 == 9)) {
				count++;
			}
			temp = a;
			if((temp % 10 == 3)||(temp % 10 == 6)||(temp % 10 == 9)) {
				count++;
			}
			
			if(count == 1) {
				System.out.println(temp+":"+"박수 한번");
			}
			if(count == 2) {
				System.out.println(temp+":"+"박수 두번");
			}
			
		}


	}

}
