
public class P10 {

	public static void main(String[] args) {
		// 학생출석률, 기말고사점수, 과제점수
		// 연산자 우선순위 같으면 왼쪽부터 계산 *주의*
		int studentAttandanceRate = 70;
		int finalExamScore = 100;
		int homeworkScore = 60;
		
		if(finalExamScore >= 90 || homeworkScore == 100 && studentAttandanceRate >= 90) {
			System.out.println("장학급 대상자입니다");
		}else {
			System.out.println("돈 내야 합니다");
		}
		if(studentAttandanceRate >= 90 && (finalExamScore >= 90 || homeworkScore == 100)) {
			System.out.println("장학급 대상자입니다");
		}else {
			System.out.println("돈 내야 합니다");
		}
		

	}

}
