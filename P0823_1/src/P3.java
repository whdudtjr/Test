
public class P3 {

	public static void main(String[] args) {
		// 변수 명명법
		// 문법적 한계: 
		// 1.대소문자 구분 
		// 2.길이 제한 없음 
		// 3.영문소대문자 + 숫자 활용 가능, 단 숫자가 먼저 나올 수 없음
		// 4.특수문자는 딱 두 개 가능 $,_
		int age = 10; 
		int aGe = 20;
		
		int aaaaaaaaaaaaaaaaaaaaaaaa = 10;
		//int 1a = 10;
		// 숫자로 시작 불가능
		int $a = 10;
		int ___ = 10;
		
		// !!중요!!: 변수 명명 스타일 
		// 카멜, 파스칼, 헝가리안, 스네이크 **결국은 카멜
		// 예: 학생 출석 점수 (student, attendance, score) 
		
		//1. 의미 있게 이름 짓자 
		//2. 단축하지않음 cnt -> count
		//3. 카멜 케이스 활용
		//나는 영어를 못 하는데 어떻게 할까
		//chatGpt, 변수 명명 사이트
		
		int student_attendance_score; //스네이크 케이스 *파이썬 스타일
		int studentAttendanceScore; //카멜 케이스 - 정답
		int StudentAttendanceScore; //파스칼 케이스 - 클래스 명명법
		int m_nStAttScore; // 헝가리안 - 요즘은 아예 안 씀
		
	}

}
