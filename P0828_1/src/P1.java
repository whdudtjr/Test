
public class P1 {

	public static void main(String[] args) {
		// 배열, 참조변수, 힙메모리
		
		//배열 => 반복문
		int a = 10;
		int b = 20;
		int c = 30;
		
		//문법: 타입[] 변수명 = new 타입[길이]
		//배열 참조변수 명명법: 복수, ~List
		
		int[] scoreList = new int[3];
		String[] nameList = new String[5];
		boolean[] xList = new boolean[10];
		
		scoreList[0] = 10;
		scoreList[1] = 20;
		scoreList[2] = 30;
		//scoreList[3] = 30; // 스택 오버 플로우
		for(int i = 0; i < scoreList.length; i++) {
			System.out.println(scoreList[i]);
		}
	}

}
