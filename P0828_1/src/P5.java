
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrOuter = null;
		
		{
			
			int[] arr1 = new int[5];
			int[] arr2 = new int[3];
			arrOuter = arr2; //arr2의 주소값을 읽는다.
			arr2[1] = 50;
			arrOuter[0] = 70;
		}
		System.out.println(arrOuter[0]);
		System.out.println(arrOuter[1]);
	}

}
