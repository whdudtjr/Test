import java.util.*;
public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		String[] nameList = new String[5];
		int[] ageList = new int[5];
		int[] scoreList = new int[5];
		int count = 0;
		
		
		System.out.println("************************");
		System.out.println("* 학생 정보 관리 프로그램 v1 *");
		System.out.println("************************");
	
		while(true) {
			System.out.println("******* 메뉴  ********");
			System.out.println("1. 정보 입력");
			System.out.println("2. 리스트 출력");
			System.out.println("3. 정보 검색");
			System.out.println("4. 정보 삭제");
			System.out.println("5. 점수 통계");
			System.out.println("q. 프로그램 종료");
			System.out.print("입력 > ");
			String command = scn.nextLine();
			
			if(command.equals("q")) {
				break;
			}
			
			if(command.equals("1")) {
				// TODO : 학생 정보 입력(이름, 나이, 점수)
				System.out.println("학생 정보 등록을 수행합니다.");
				System.out.print("이름 입력 >");
				String name = scn.nextLine();
				
				System.out.print("나이 입력 >");
				String inputAge = scn.nextLine();
				int age = Integer.parseInt(inputAge);
				
				System.out.print("점수 입력 >");
				String inputScore = scn.nextLine();
				int score = Integer.parseInt(inputScore);
				
				nameList[count] = name;
				ageList[count] = age;
				scoreList[count] = score;
				
				count++;
				
				//메모리가 꽉 찼을 때, 배열 메모리 증가
				if(count == nameList.length) {
					String[] tempNameList = new String[nameList.length*2];
					for(int x = 0; x < nameList.length; x++) {
						tempNameList[x] = nameList[x];
					}
					nameList = tempNameList;
					
					int[] tempAgeList = new int[ageList.length*2];
					for(int x = 0; x < ageList.length; x++) {
						tempAgeList[x] = ageList[x];
					}
					ageList = tempAgeList;
					
					int[] tempScoreList = new int[scoreList.length*2];
					for(int x = 0; x < scoreList.length; x++) {
						tempScoreList[x] = scoreList[x];
					}
					scoreList = tempScoreList;
				}
				
				
			}else if(command.equals("2")) {
				// TODO : 학생 리스트 출력
				System.out.println("******** 학생 리스트 출력 *********");
				
				if(count == 0) {
					System.out.println("등록된 리스트가 없습니다.");
				}
				
				for(int i = 0; i < count; i++) {
					String name = nameList[i];
					int age = ageList[i];
					int score = scoreList[i];
					
					String result = "이름: " + name + "나이: " + age + "점수: " + score;
					System.out.println(result);
				}
				
			}else if(command.equals("3")) {
				// TODO : 학생 정보 검색
			}else if(command.equals("4")) {
				// TODO : 정보 삭제
			}else if(command.equals("5")) {
				// TODO : 점수 통계
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			
			System.out.println("계속 하시혀면 enter를 입력해주세요");
			scn.nextLine();
		}
		
	System.out.println("프로그램을 종료합니다.");
	scn.close();
	}

}
