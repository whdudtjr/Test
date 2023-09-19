import java.util.*;
import java.io.*;
public class Backjoon_9012 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<Character>();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int x = 0; x < T; x++) {
			st = new StringTokenizer(br.readLine());
			String ps = st.nextToken();
			for(int y = 0; y < ps.length(); y++) {
				char c = ps.charAt(y);
				if(c == '(') {
					stack.push(c);
				}
				else {
					if(stack.isEmpty()) {
						stack.push(c);
						break;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.isEmpty()) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			stack.clear();
		}
	}
}