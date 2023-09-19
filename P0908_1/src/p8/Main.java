package p8;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// 랜덤
		int a1 = (int)(Math.random()*100 +1);
		
		System.out.println(a1);

		//
		Random random = new Random();
		int a2 = random.nextInt(10);
		System.out.println(a2);
		
		Random random2 = new Random(3);
		System.out.println(random2.nextInt(50));
		System.out.println(random2.nextInt(50));
		System.out.println(random2.nextInt(50));
		System.out.println(random2.nextInt(50));
		System.out.println(random2.nextInt(50));
		
		System.out.println(random.nextGaussian());
	}

}
