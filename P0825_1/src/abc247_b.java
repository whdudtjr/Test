import java.util.*;
public class abc247_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);

	     String inputNum = scan.nextLine();
	     int num = Integer.parseInt(inputNum);

	     String[] nameList = new String[num];

	     String[] sList = new String[num];
	     String[] tList = new String[num];


	     for(int x = 0; x < num; x++) {
	        String inputName = scan.nextLine();
	        nameList = inputName.split(" ");
	        sList[x] = nameList[0];
	        tList[x] = nameList[1];
	     }

	     String[] a1 = new String[num];
	     String[] a2 = new String[num];

	     boolean result1 = false;
	     boolean result2 = false;
	     int count = 0;
	     
	     for(int x = 0; x < sList.length; x++) {
	    	 for(int y = 0; y< tList.length; y++) {
	    		 if(sList[x].equals(tList[y])) {
	    			 count++;
	    		 }
	    	 }
	     }
	     
	     for(int x = 0; x < sList.length-1; x++) {
	    	 if(sList[x].equals(sList[x+1])) {
	    		 result1 = true;
	    		 break;
	    	 }
	     }
	     
	     for(int x = 0; x < tList.length-1; x++) {
	    	 if(tList[x].equals(tList[x+1])) {
	    		 result2 = true;
	    		 break;
	    	 }
	     }
	     
	     if((result1 && result2 == true) || count == 2) {
	    	 System.out.println("no");
	     }else {
	    	 System.out.println("yes");
	     }
	}

}
