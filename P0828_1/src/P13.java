
public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,4,2,1,9,8};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int temp = 0;
		//선택 정렬
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}
		//버블 정렬
		for(int x = arr.length; x > 0; x--) {
			for(int y = 0; y < x; y++) {
				if(arr[y] > arr[y+1]) {
					temp = arr[y];
					arr[y] = arr[x];
					arr[x] = temp;
				}
			}
			System.out.println(arr[x]);
		}
	}

}
