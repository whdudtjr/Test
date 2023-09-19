package p1;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// 자료구조(컬렉션 프레임워크)를 선택 -> 모든 자료 구조는 장,단점이 존재
		// 결론: 장단점 다 정리 되어있음
		// 배열의 장점 : 값의 접근은 누구보다 빠름
		// 배열의 단점 : 배열의 크기(메모리 낭비), 오버플로우, 중간값 삭제가 힘듦(처리시간이 오래 걸림)
		// 우리는 데이터베이스를 사용하기 때문에 결국 arraylist와 hashmap만 다룰 수 있으면 된다.
		// List 계열, Set 계열, Map 계열
		// List: 순서가 있다. ex) Array, Linked
		// Set: 순서가 없다.
		// Map: 순서가 없다.
		// linkedList(알고리즘)	

		MyLinkedList<String> list = new MyLinkedList<>();
		list.add("안녕1");
		list.add("안녕2");
		list.add("안녕3");
		list.add("안녕4");
		list.add("안녕5");
		
		list.remove(2);
		list.add(2, "하하하");
		
		String value = list.get(3);
		System.out.println(value);
		
		for(int x = 0; x < 5; x++) {
			System.out.println(list.get(x));
		}
		
		
	}
}
//한 블록의 노드 생성 value + next(다음 주소를 가리킬 부분)
class Node<E>{
	E value;//값
	Node<E> next;//다음 노드를 지정
}

class MyLinkedList<E>{
	Node<E> first;//Node<E> 타입의 first 참조변수 선언
	
	void add(E value) {
		Node<E> newNode = new Node<>();//newNode 생성
		newNode.value = value;// newNode에 value 값 지정 (실제값)
		
		//만약 first값이 null이면 newNode메모리를 first에 넣어주고 return으로 나감
		if(first == null) {
			first = newNode;
			return;
		}
		// Node<E> 타입의 temp 변수에 first 값 넣어줌
		Node<E> temp = first;
		while(true) {
			// 만약 temp.next의 주소값이 null일 때 나감
			if(temp.next == null) {
				break;
			}
			//temp.next의 메모리 주소값를 temp에 넣어줌
			temp = temp.next;
		}
		//newNode값을 temp.next에 넣어줌
		temp.next = newNode;
	}
	//링크드 리스트의 최대 단점
	E get(int index){
		Node<E> temp = first;
		
		for(int x = 0; x < index; x++) {
			temp = temp.next;
		}
		return temp.value;
	}
	
	void remove(int index) {
		Node<E> temp = first;
		
		for(int x = 0; x < index-1; x++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	void add(int index,E value) {
		Node<E> newNode = new Node<>();
		newNode.value = value;
		
		Node<E> temp = first;
		for(int x = 0; x < index-1; x++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
}








