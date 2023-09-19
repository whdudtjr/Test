
public class P17 {

	public static void main(String[] args) {
		// 별찍기
		//      *
		//     **
		//    ***
		//   ****
		//  *****
		
		for(int i = 1; i<=5; i++){
			for(int j = 5; j > i; j--){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}

}
