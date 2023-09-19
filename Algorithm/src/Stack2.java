import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
public class Stack2 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력
		StringBuilder sb = new StringBuilder();//문자열 sb 생성
		Stack<Integer> stack = new Stack<Integer>(); //스택 생성
		StringTokenizer st; //조건 1,2,3,4,5 읽어들이기
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++)
		{
			st = new StringTokenizer(br.readLine());//st에 입력값을 받겠다.
			String command = st.nextToken();// 커맨드라는 문자열 변수에 버퍼리더로 읽어들인 값을 저장하겠다라는 뜻
			if(command.equals("1"))stack.push(Integer.parseInt(st.nextToken()));
			else if(command.equals("2"))
			{
				if(!stack.isEmpty())
				{
					sb.append(stack.lastElement()).append("\n");
					stack.pop();
				}
				else sb.append(-1).append("\n");
			}
			else if(command.equals("3")) sb.append(stack.size()).append("\n");
			else if(command.equals("4")) 
				if(stack.isEmpty()) sb.append(1).append("\n");
				else sb.append(0).append("\n");
			else if(command.equals("5"))
				if(stack.isEmpty())sb.append(-1).append("\n");
				else sb.append(stack.lastElement()).append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
