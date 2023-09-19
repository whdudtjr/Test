
public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2부터 100 소수 값을 구해보자
		// 세팅
		int[] arr = new int[99];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+2);
		}
		//알고리즘
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				System.out.println(arr[i] + "는 소수입니다.");
				
				for(int x = i+1; x < arr.length; x++) {
					if(arr[x] != 0 && arr[x] % arr[i] == 0) {
						arr[x] = 0;
					}
				}
			}
		}
	}

}
