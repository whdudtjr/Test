package polymorpism;

public class User  {
	private Tv tv;
	
	public User() {
		
	}
	public void setTv(Tv tv) {
		this.tv = tv;
	}
	
	public void watchTv() {
		System.out.println("사용자 TV를 시청합니다.");
		
		tv.powerOn();
		tv.powerOff();
		tv.soundDown();
		tv.soundUp();
		
		
		System.out.println("잡니다.");
	}
}
