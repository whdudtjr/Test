package polymorpism;

public class TvFactory {
	public Tv create(String name) {
		switch(name) {
		case "samsung":
			return new SamsungTv();
		case "lg":
			return new LgTv();
		default:
			return null; 
		}
	}
}
