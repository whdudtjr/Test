
public class P3 {

	public static void main(String[] args) {
		// 참조변수와 heap메모리
		// 모든 지역변수는 stack에 쌓인다.
		// 변수는 기본타입과 참조타입을 나뉜다.
		// new: 메모리를 생성하는 키워드, heap 메모리에 생성한다.
		// heap 메모리는 따로 초기화 안 해줘도 0으로 초기화 돼 있음.
		// heap 메모리에는 주소값이 들어감.
		// []: 접근 연산자  주소값에 접근해서 값을 읽어오겠다.
		// stack 과 heap 의 차이
		// 메모리 소멸 메커니즘이 다르다.
		
		
		int a = 10;
		
		
		int[] arr = new int[5];
		int[] arr1 = new int[6];
		
//		arr1[0] = 10;
//		arr1[1] = 10;
//		arr1[2] = 10;
//		arr1[3] = 10;
//		arr1[4] = 10;
//		arr1[5] = 10;
		
		arr = null; // null: 주소가 없음을 나타내는 값.
		arr[0] = 20;
		
//		arr = arr1; //메모리 자체를 교체해버림,,,
//		
//		for(int i = 0; i <6; i++) {
//			System.out.println(arr[i]);
//		}

	}

}
