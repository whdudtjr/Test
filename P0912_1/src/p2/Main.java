package p2;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		// Queue는 인터페이스 큐를 구현할 링크드리스트 생성
		// 문법적으로는 앞에껄 따라간다. 아래에서 Queue를 따라간다.
		// Queue에 해당하는 API만 쓰도록 문법적 제한을 걸어두는거임
		Queue<Integer>  queue = new LinkedList<>();//다형성
		// 아래꺼는 LinkedList를 따라간다.
		// LinkedList의 API를 모두 쓸 수 있음
		//LinkedList<String> queue = new LinkedList<>();
		queue.offer(1);
		queue.offer(1);
		queue.offer(1);
		queue.offer(1);
		queue.poll();
		
		for(int e : queue) {
			System.out.println(e);
		}
	}

}
