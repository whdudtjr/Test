package p10;

import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = IntStream.range(0, 10)
			.filter(e->e%2==0)
			.distinct()
			.sum()
			;
		
		System.out.println(sum);
	}

}
