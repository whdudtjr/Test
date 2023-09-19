
public class P4 {

	public static void main(String[] args) {
		// System
		
		long time = System.currentTimeMillis();
		
		int sum = 0;
		for(int x = 0; x < 100000; x++) {
			sum += x;
		}
		System.out.println(sum);
		
		time = System.currentTimeMillis() - time;
		System.out.println(time);
		
		System.out.println(time/1000/60/60/24/365);
	}

}
