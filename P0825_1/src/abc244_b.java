import java.util.*;
public class abc244_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("1행 값 입력 > ");
		String input1Value = scn.nextLine();
		
		int n = Integer.parseInt(input1Value);
		
		System.out.print("2행 값 입력 > ");
		
		
		String input2Value = scn.nextLine();
        String[] input2List = input2Value.split("");
	
		int x = 0;
		int y = 0;
		int rotatedX = 1;
		int rotatedY = 0;
		int temp = 0;

		for(int i = 0; i < n; i++) {
			
			
			if(rotatedX == 1 && rotatedY == 0){
				if(input2List[i].equals("S")){
					x = x+1;
				}else{
					rotatedX = 0;
					rotatedY = -1;
				}
			}else if(rotatedX == 0 && rotatedY == -1){
				
				if(input2List[i].equals("S")){
					y = y-1;
				}else{
					rotatedX = -1;
					rotatedY = 0;
				}
			}else if(rotatedX == -1 && rotatedY == 0){
				if(input2List[i].equals("S")){
					x = x-1;
				}else{
					rotatedX = 0;
					rotatedY = 1;
				}
			}else{
				if(input2List[i].equals("S")){
					y = y+1;
				}else{
					rotatedX = 1;
					rotatedY = 0;
				}
			}	
		}
		System.out.println(x + " " + y);		
	}
}
