
public class P9 {

	public static void main(String[] args) {
		// 논리 연산자: 도출되는 결과 boolean, 피연산자 모두 boolean이어야 함
		// &&, ||, !
		// && : and, 논리곱, 피연산자 둘 다 true여야만 true, 나머진 false
		// || : or, 논리합, 피연산자 둘 중 하나만 true여도 true, 둘 다 false일 때만 false
		// ! : not, true면 false로 바꿔주고, false면 true로 바꿔준다.
		int a = 10;
		int b = 13;
		
		boolean result = a > 10 && b < 10;
		result = a >= 10 || b < 10;
		
		// !
		boolean c = false;
		result = !c;
		
		result = !(a > 10 || b < 10);
		}

}
