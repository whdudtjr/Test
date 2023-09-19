import java.util.Date;

public class P5 {

	public static void main(String[] args) {
		// 날짜, 숫자, 문자
		Date d1 = new Date();
		System.out.println(d1);
		
		Date d2 = new Date();

		//미국은 1월이 0부터 시작임, 시작이 1이 아님
		Date d3 = new Date(97, 4, 4);
		System.out.println(d3);
		
		if(d1.after(d2)) {
			
		}
		
		System.out.println(d1.getMonth());
	}

}
