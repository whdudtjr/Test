
public class practice18 {

	public static void main(String[] args) {
//		1~10000사이에 8이 몇번 나오는가?
//
//				정답 ) 4000
//				힌트 ) 8838 = 3개...
//		int start = 1;
//		int end = 10000;
//		int count = 0;
//		
//		while(start < end) {
//			
//			int result = start;
//			while(true) {
//				if(result % 10 == 8) {
//					count++;
//				}
//				
//				result = result / 10;
//				
//				if(result < 1) {
//					break;
//				}
//			}			
//			
//			start++;
//		}
//		System.out.println(count);
//	}	
//}

//		int start = 1;
//		int end = 10000;
//		int count = 0;
//		
//		for(start = 1; start < end; start++) {
//			
//			int result = start;
//			while(true) {
//				if(result % 10 == 8) {
//					count++;
//				}
//				
//				result = result / 10;
//				
//				if(result < 1) {
//					break;
//				}
//			}			
//			
//		}
//		System.out.println(count);
//	}	
//}

		int start = 1;
		int end = 10000;
		int count = 0;
		
		for(start = 1; start < end; start++) {
			
			int result = start;
			
			while(true) {
				if(result % 10 == 8) {
					count++;
				}
				
				result = result / 10;
				
				if(result < 1) {
					break;
				}
			}			
			
		}
		System.out.println(count);
	}	
}