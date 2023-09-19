package p5;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Some s1 = new Some();
		s1.start();
		Some s2 = new Some();
		s2.start();
		Some s3 = new Some();
		s3.start();
		Some s4 = new Some();
		s4.start();
		Some s5 = new Some();
		s5.start();
		
		s1.join();
		s2.join();
		s3.join();
		s4.join();
		s5.join();
		System.out.println(Data.list.size());
	}

}
class Some extends Thread{
	public void run() {
		for(int x = 0; x < 200; x++) {
			Data.list.add("그냥,,,");
		}
		System.out.println("쓰레드 끝");
	}
}

class Data {
	public static List<String> list = new Vector<>();
	
}
