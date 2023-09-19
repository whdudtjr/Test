
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그래머가 사용할 수 있는 메모리의 개수는 4개
		// [] 접근 연산자 이거 이해 중요*
		int[][] arr1 = new int[3][3];
		
		arr1[0][2] = 40;
		
		arr1[0] = new int[5];
		
		//위에 코드를 순차적으로 나눠보면
		int [][] arr2 = new int[3][];
		arr2[0] = new int[3];
		arr2[1] = new int[3];
		arr2[2] = new int[3];
	}

}
