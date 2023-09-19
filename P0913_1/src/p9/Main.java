package p9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(1);
		list.add(7);
		list.add(1);
		list.add(2);
		
		int sum = 0;
		
		Set<Integer> set = new TreeSet<>();
		
		for(int e : list) {
			if(!set.add(e)) continue;
			
			if(e%2==0) continue;
				sum += e;
		}
		
		int sum2 = list.stream()	
			.distinct()
			.filter(e->e%2!=0)
			.reduce((acc,e)-> acc*e)
			.orElseThrow()
		;
		System.out.println(sum2);
	}

}
