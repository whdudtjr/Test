
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= new int [4][3];
		
		arr[2][1] = 10;
		arr[1][0] = 50;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
