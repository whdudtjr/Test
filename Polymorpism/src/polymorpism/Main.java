package polymorpism;

public class Main {

	public static void main(String[] args) {
		// 인터페이스는 표준을 정의한다.
		// 조립 설정 코드
		TvFactory factory = new TvFactory();
		Tv tv = factory.create("lg");
		
		User user = new User();
		user.setTv(tv);
		user.watchTv();
	}

}




























