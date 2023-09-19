package p8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 제너릭

		AAA<Integer> a1 = new AAA<Integer>();
		a1.v1 = 10;
		
		AAA<String> a2 = new AAA<String>();
		a2.v1 = "ddd";
		
		AAA<Character> a3 = new AAA<Character>();
		a3.v1 = 'd';
		
		AAA<Scanner> a4 = new AAA<Scanner>();
		a4.v1 = new Scanner(System.in);
		
	}

}
class AAA<QQQQQQ>{
	QQQQQQ v1;
	boolean v2;
}

class A1{
	int v1;
	boolean v2;
}

class A2{
	double v1;
	boolean v2;
}
class A3{
	String v1;
	boolean v2;
}