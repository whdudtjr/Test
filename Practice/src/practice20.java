
public class practice20 {

	public static void main(String[] args) {
		// <문제> 거스름 돈: 문제 설명
//		당신은 음식점의 계산을 도와주는 점원입니다. 
//		카운터에는 거스름돈으로 사용할 500원, 100원, 50원,10원짜리 동전이 
//		무한히 존재한다고 가정합니다. 
//		손님에게 거슬러 주어야 할 돈이 N원일 때 거슬러 주어야 할 동전의 최소 개수를 구하세요. 
//		단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.
//		[출처] 연습 문제|작성자 s001lec
		
		// 
		int change = 5000;
		int coin = 0;
		
		coin = change / 500;
		
		change = change % 500;
		
		coin += change / 100;
		
		change = change % 100;
		
		coin += change / 50;
		
		change = change % 50;
		
		coin += change / 10;
		
		
		System.out.println(coin);
		



	}

}
