import java.util.*;
public class A6 {

	public static void main(String[] args) {
		// A - 티셔츠

//문제 설명
//어떤 프로그래밍 대회에서, 티셔츠가 다음 규칙에 따라 참가자들에게 수여된다.
//A위 또는 그 이상의 순위에 오른 모든 참가자는 티셔츠를 받는다.
//추가적으로, (A+1)위부터 B위(포함)에 오른 참가자 중에서 균등하게 무작위로 뽑힌 C명의 참가자들은 티셔츠를 받는다.
//
//이번 대회에는 1000명이 참가했고, 모두 순위가 달랐다.
//이번 대회에 참가한 이로하짱은 X위에 올랐다.
//그녀가 티셔츠를 받을 확률을 구하라.
	Scanner scn = new Scanner(System.in);
	System.out.print("갑 입력: > ");
	String inputValue = scn.nextLine();
	System.out.println("입력 받은 값: " + inputValue);
	String [] inputs = inputValue.split(" ");
	
	Random random = new Random();
	Set<Integer> generatedNumbers = new HashSet<>();
	
	int a = Integer.parseInt(inputs[0]);
	int b = Integer.parseInt(inputs[1]);
	int c = Integer.parseInt(inputs[2]);
	int x = Integer.parseInt(inputs[3]);
	
	int rank = x;
	
	
	double probablity = 0.0;
	
	if(rank <= a) {
		probablity = (double)a / 1000;
		System.out.println(probablity);
		
	}
	
	if(rank >= (a+1) && rank <= b) {
		while(generatedNumbers.size() < c) {
			int randomInRange = random.nextInt((b-a)) + a ;
			rank = randomInRange;
			if(!generatedNumbers.contains(rank)){
				generatedNumbers.add(rank);
			}
			if(rank == x) {		
				probablity = (double)(b-a+1)/1000;
				System.out.println(probablity);
				break;
		}
			
	  }
	} 
	if(a < rank){
		System.out.println(probablity);
	}
	
  }
}


