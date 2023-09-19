
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2~100사이의 소수를 구해보자
//		ProblemSolver s1 = new ProblemSolver();
//		s1.solve();
		new ProblemSolver(-5,100).solve();
		new ProblemSolver(30,50).solve();
	}
}
//컴포넌트(기능 위주) <-> Dto (자료구조 클래스) 
class ProblemSolver{
	
	private int start;
	private int end;
	
	public ProblemSolver(int start, int end) {
		if(start < 2) {
			System.out.println("경고] 스타트는 1보다 커야 합니다. 2로 초기화하겠습니다.");
			start = 2;
		}
		this.start = start;
		this.end = end;
	}
	
	public void solve() {
		for(int x = start; x <= end; x++) {
			if(checkPrime(x)) {
				printPrime(x);
			}
		}
	}
	
	private boolean checkPrime(int target) {
		for(int y = 2; y < target; y++) {
			if(target % y == 0) {
				return false;
			}
		}
		return true;
	}
	
	private void printPrime(int target) {
			System.out.println(target + "는 소수입니다");
		
	}
}










