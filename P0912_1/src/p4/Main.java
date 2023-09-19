package p4;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<AAA> set = new TreeSet<>();
		
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		AAA a3 = new AAA();
		AAA a4 = new AAA();
		
		set.add(a1);
	}

}

class AAA implements Comparable<AAA>{
	int v1;
	int v2;
	public int compareTo(AAA o) {
		if(this.v1 + this.v2 > o.v1 + o.v2);
		return 0;
	}
}

