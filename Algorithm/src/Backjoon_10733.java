import java.util.*;
import java.io.*;
public class Backjoon_10733 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 입력
		Stack<Integer> stack = new Stack<Integer>();
		StringTokenizer st;
		int K = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i = 0; i < K; i++){
			st = new StringTokenizer(br.readLine());
			String num = st.nextToken();
			if(num.equals("0")){
				stack.pop();
			}else{
				stack.push(Integer.parseInt(num));
			}
		}
		for(int x : stack) {
			sum += x;
		}
		System.out.println(sum);
	}
}
