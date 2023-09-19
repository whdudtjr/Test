import java.util.*;
public class Main {

	public static void main(String[] args) {
		// 기능: 1. 학생 정보 입력, 2. 학생 정보 리스트 출력, 3. 이름으로 검색, 4. 학생 정보 삭제, 5. 점수 통계 6. 정렬하기 7. 출력할 때만 출력하기
		// 학생 정보: 이름, 나이, 점수
		// 배열을 묶을 때는 추상화가 같은 것끼리 묶는게 좋다
		// 클래스 분리
		// 첫번째, 데이터(dto) 분리
		Scanner scn = new Scanner(System.in);
		
		String[] nameList = new String[5];
		int[] ageList = new int[5];
		int[] scoreList = new int[5];
		int count = 0;
		
		
		System.out.println("************************");
		System.out.println("* 학생 정보 관리 프로그램 v1 *");
		System.out.println("************************");
		
		while(true) {
			System.out.println("******* 메뉴 (현재 학생 수: "+count+") ********");
			System.out.println("1. 정보 입력");
			System.out.println("2. 리스트 출력");
			System.out.println("3. 정보 검색");
			System.out.println("4. 정보 삭제");
			System.out.println("5. 점수 통계");
			System.out.println("q. 프로그램 종료");
			System.out.print("입력 > ");
			String command = scn.nextLine();
			
			if (command.equals("q")) {
				break;
			}
			
			if(command.equals("1")) {
				// todo: 정보 입력	
				
				System.out.println("학생 정보 등록 수행합니다.");
				System.out.print("이름 입력 >");
				String name = scn.nextLine();
				
				System.out.print("나이 입력 >");
				String inputAge = scn.nextLine(); 
				int age = Integer.parseInt(inputAge);
				
				System.out.print("점수 입력 >");
				String inputScore = scn.nextLine();
				int score = Integer.parseInt(inputScore);
				
				//입력된 값을 각 배열에 넣어줌
				nameList[count] = name;
				ageList[count] = age;
				scoreList[count] = score;
				count++;
				
				// 꽉 찼을 때, 배열 메모리 증가
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
				System.out.println("입력이 완료되었습니다.");
				
			}else if(command.equals("2")) {
				// todo: 리스트 출력
				
				System.out.println("***** 학생 리스트 출력 *****");
				// 아무것도 입력 안 됐을 때, 예외 처리
				if(count == 0) {
					System.out.println("등록된 리스트가 없습니다");
				}
				//이름,나이,점수를 배열에 넣음
				for(int i = 0; i < count; i++) {
					String name = nameList[i];
					int age = ageList[i];
					int score = scoreList[i];
					
					String result = "이름: " + name + "나이: " + age + "점수: " + score;
					System.out.println(result);
				}
			}else if(command.equals("3")) {
				// todo: 정보 검색
				System.out.println("***** 학생 검색 *****");
				System.out.print("검색할 학생의 이름 입력 > ");
				String inputSearchWord = scn.nextLine();
				
				int searchCount = 0;
//				for(int i = 0; i < count; i++) {
//					if(inputSearchWord.equals(nameList[i])) {
//						String name = nameList[i];
//						int age = ageList[i];
//						int score = scoreList[i];
//						
//						String result = "이름:" + name + "나이:" + age + " " + "점수:" + " " + score;
//						System.out.println(result);
//						searchCount++;
//					}
//				}
				for(int i = 0; i < count; i++) {
					if(nameList[i].contains(inputSearchWord)) {
						String name = nameList[i];
						int age = ageList[i];
						int score = scoreList[i];
						
						String result = "이름:" + name + " " + "나이:" + age + " " + "점수:" + score;
						System.out.println(result);
						searchCount++;
					}
				}
				System.out.println(searchCount+"명의 학생이 검색되었습니다");
				
			}else if(command.equals("4")) {
				// todo: 정보 삭제
				
				System.out.println("********** 학생 정보 삭제 **********");
				System.out.print("삭제할 학생의 이름 > ");
				String deleteName = scn.nextLine();
				int deleteCount = 0;
				
				for(int x = 0; x < count; x++) {
					if(deleteName.equals(nameList[x])) {
						for(int y = x; y < count -1; y++) {
							nameList[y] = nameList[y+1];
							ageList[y] = ageList[y+1];
							scoreList[y] = scoreList[y+1];
						}
						count--;
						x--;
						deleteCount++;
					}
				}
				System.out.println(deleteCount + "명의 학생이 삭제되었습니다.");
				
			}else if(command.equals("5")) {
				// todo: 점수 통계 (총 인원, 평균, 최대값, 표준편차)
				
				int sum = 0;
				for(int x = 0; x < count; x++) {
					sum += scoreList[x];	
				}
				double average = sum/(double)count;
				
				int maxScore = 0;
				for(int x = 0; x < count; x++) {
					maxScore = scoreList[x];
				}
				
				// 표준 편차
				double tempVarSum = 0;
				for(int x = 0; x < count; x++) {
					double deviation  = scoreList[x] - average;
					tempVarSum += deviation * deviation;
				}
				
				
				double std = Math.sqrt(tempVarSum/count);
				
				System.out.println("******** 점수 통계 *********");
				System.out.println("총 인원:" + count);
				System.out.println("평균: " + average);
				System.out.println("최고점: " + maxScore);
				System.out.println("표준편차: " + std);
				
				
			}else {
				// 예외
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
			
			System.out.println("계속 하시려먼 enter를 입력해주세요"); // 분기가 끝나고 그 결과는 보여주기 위해 멈춰줌
			scn.nextLine();
		
		}
		
		System.out.println("프로그램이 종료합니다. 이용해 주셔서 감사합니다.");
		scn.close();
	}

}
