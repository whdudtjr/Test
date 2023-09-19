package p2;

public class Main {
	//완벽한 상수 표현법
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week day = Week.Sunday;
		
		switch(day) {
		case Sunday:
			System.out.println("일요일");
			break;
		case Monday:
			System.out.println("월요일");
			break;
		case Tuesday:
			System.out.println("화요일");
			break;
		case Wednesday:
			System.out.println("수요일");
			break;
		case Thursday:
			System.out.println("목요일");
			break;
		case Friday:
			System.out.println("금요일");
			break;
		case Saturday:
			System.out.println("토요일");
			break;
		default:
			break;
		}
	}

}
