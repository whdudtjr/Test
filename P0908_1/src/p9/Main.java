package p9;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuilder와 StringBuffer의 차이점을 얘기해보세요

		//StringBuilder sb = new StringBuilder();
		StringBuffer sb = new StringBuffer(1000);
		String str1 = "안녕";
		sb.append(str1);
		for(int x = 0; x < 10; x++) {
			sb.append("반갑");// str += "반갑";
			
		}
		
		String str2 = sb.toString();
		System.out.println(str2);
	}

}
