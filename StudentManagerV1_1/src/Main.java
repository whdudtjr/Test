import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 학생 관리 프로그램 
		// 기능: 1. 학생 정보 입력 2. 학생 리스트 출력 3. 학생 검색 4.학생 삭제 5. 학생 점수 통계 q. 프로그램 종료하겠습니다.
		Scanner scn = new Scanner(System.in);
		
		System.out.println("********************");
		System.out.println("****학생 관리 프로그램****");
		System.out.println("********************");
		System.out.println("메뉴를 보시려면 Enter를 눌러주세요");
		String inputValue = scn.nextLine();
		int count = 0;
		
		String[] nameList = new String[5];
		int[] ageList = new int[5];
		int[] scoreList = new int[5];
		
		while(true) {
			
			System.out.println("*******메뉴 리스트" + "총 인원: " + count + "명 ******");
			System.out.println("1. 학생 정보 입력");
			System.out.println("2. 학생 리스트 출력");
			System.out.println("3. 학생 정보 검색");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 학생 점수 통계");
			System.out.println("q. 프로그램을 종료");
			System.out.print("입력해주세요 > ");
			String command = scn.nextLine();
			

			if(command.equals("q")) {
				//프로그램 종료
				break;
			}
		
			if(command.equals("1")) {
				//학생 정보 입력(이름,나이,점수)
				System.out.print("이름: ");
				String name = scn.nextLine();
				System.out.print("나이: ");
				int age = Integer.parseInt(scn.nextLine());
				System.out.print("점수: ");
				int score = Integer.parseInt(scn.nextLine());
				
				//count 변수를 생성해서 각 배열에 입력한 값을 넣어줌
				nameList[count] = name;
				ageList[count] = age;
				scoreList[count] = score;
				count++;
				
				//이제 배열의 크기를 늘려줘야 함.
				// 만약에 카운트 값이 이름이 들어간 배열의 길이와 같을 때,
				
				if(nameList.length == count) {
					//배열의 길이를 2배로 늘려줘야 함
					String[] newNameList = new String[nameList.length*2];
					for(int x = 0; x < nameList.length; x++) {
						newNameList[x] = nameList[x];
					}
					nameList = newNameList;
				
					//배열의 길이를 2배로 늘려줘야 함
					int[] newAgeList = new int[ageList.length*2];
					for(int x = 0; x < ageList.length; x++) {
						newAgeList[x] = ageList[x];
					}
					ageList = newAgeList;
				
				
					int[] newScoreList = new int[scoreList.length*2];
					for(int x = 0; x < scoreList.length; x++) {
						newScoreList[x] = scoreList[x];
					}
					scoreList = newScoreList;
				}
		
			
			}else if(command.equals("2")){
				//학생 리스트 출력
				System.out.println("*****학생 리스트 출력*****");
				for(int x = 0; x < count; x++) {
					System.out.println("이름: " + nameList[x] + "나이: " + ageList[x] + "점수: " + scoreList[x]);
				}
				System.out.println(count + "명이 있습니다");
			}else if(command.equals("3")) {
				//학생 검색
				int searchCount = 0;
				String searchName = scn.nextLine();
				for(int x = 0; x < count; x++) {
					if(nameList[x].equals(searchName)) {
						System.out.println("이름: " + nameList[x] + "나이: " + ageList[x] + "점수: " + scoreList[x]);
						searchCount++;
					}
				}
				System.out.println(searchCount + "명이 검색되었습니다");
			}else if(command.equals("4")) {
				//학생 삭제
				int deleteCount = 0;
				String deleteName =scn.nextLine();
				
				for(int x = 0; x < count; x++) {
					if(nameList[x].equals(deleteName)) {
						for(int y = x; y < count-1; y++) {
							nameList[y] = nameList[y+1];
							ageList[y] = ageList[y+1];
							scoreList[y] = scoreList[y+1];
						}
						count--;
						x--;
						deleteCount++;
					}
				}
				System.out.println(deleteCount + "명이 삭제되었습니다");
			}else if(command.equals("5")){
				//점수 통계
				int sum = 0;
				
				for(int x = 0; x<count; x++) {
					sum += scoreList[x];
					
				}
				System.out.println("점수의 총합: " + sum);
				
				double average = sum/(double)count;
				System.out.println("점수의 평균: " + average);
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 입력해주세요");
				scn.nextLine();
			}
		}
		System.out.println("프로그램을 종료하겠습니다.");
	}

}
