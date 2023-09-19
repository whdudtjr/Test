import java.util.*;
public class abc247_a {

	public static void main(String[] args) {
		// 4개의 정사각형이 가로로 늘어서 있다.

//0과 1로 구성된 길이 4의 문자열 S가 주어진다.
//만약 S의 i번째 문자가 1이라면, 왼쪽에서 i번째 정사각형에 사람이 있다.
//만약 S의 i번째 문자가 0이라면, 왼쪽에서 i번째 사각형에는 사람이 없다.
//
//이제, 모든 사람들이 동시에 오른쪽의 다음 칸으로 이동한다. 이렇게 하면, 원래 가장 오른쪽 정사각형에 있던 사람이 사라진다.
//
//이동 후, 각 정사각형에 사람이 있는지 구하라. S와 동일한 형식의 문자열로 결과를 인쇄하라. (자세한 내용은 샘플 입력/출력 참조).
		
		Scanner scn = new Scanner(System.in);
		System.out.print("값 입력: > ");
		String inputValue = scn.nextLine();
		char [] arr = inputValue.toCharArray(); // 문자열을 char형으로 변환 후 배열로 저장
		int i = 0;
		int j = 0;
		
		int[] newArr = new int[9];
		for(j = 0; j < 4; j++) {
			newArr[j] = arr[j]-'0';
		}
		
		for(i = newArr.length-1; i >0 ; i--) {
			newArr[i]=newArr[i-1];
		}
		newArr[0]=0;
		for(j = 0; j < 4; j++) {
			System.out.print(newArr[j]);
		}
	}
}
