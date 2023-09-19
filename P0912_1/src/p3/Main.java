package p3;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// 이진 트리
		// 값의 중복 허용x
		// 순서x
		// 값의 탐색에 유용함
		// 값이 정렬됨
		// 정렬 순서 : 왼쪽 -> 오른쪽
		// remove 절대 놉
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(10);
		treeSet.add(10);
		treeSet.add(5);
		treeSet.add(7);
		
		
		for(int e : treeSet) {
			System.out.println(e);
		}
		
		boolean a = treeSet.contains(5);
		System.out.println(a);
		//treeSet.remove(10);// 절대 쓰지 말것
	}

}
class Node<E>{
	E value;
	Node<E> left;
	Node<E> right;
}