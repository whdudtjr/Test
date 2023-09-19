package p1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// Stack
		Stack<String> stack = new Stack<>();
		stack.push("일");
		stack.push("이");
		stack.push("삼");
		stack.push("사");
		stack.pop();
		stack.pop();
		for(String e : stack) {
			System.out.println(e);

		}
		
		

	}
}