package p4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = new Test().doProcess(100);
		System.out.println(sum);
		char a = 'd';
		String c = "dasdasd";
	}

}

class Test{
	//재귀 함수
	public int doProcess(int value) {
		int sum = value;
		if(value <=0) {
			return 0;
		}
		System.out.println("안녕");
		value--;
		sum += doProcess(value);
		
		
		return sum;
	}
}
