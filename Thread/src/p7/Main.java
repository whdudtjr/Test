package p7;

public class Main {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		long sum = 0;
//		
//		for(long x = 1; x <= 1000000; x++) {
//			sum += x;
//		}
//		
//		System.out.println(sum);
//	}
		CalcThread t1 = new CalcThread(0, 250000);
		CalcThread t2 = new CalcThread(250001, 500000);
		CalcThread t3 = new CalcThread(500001, 750000);
		CalcThread t4 = new CalcThread(750001, 1000000);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		
			
		long sum = t1.getResult() + t2.getResult() + t3.getResult() + t4.getResult();
		System.out.println(sum);
	}
}

class CalcThread extends Thread{
	
	private long start;
	private long end;
	private long result;
	
	public CalcThread(long start, long end) {
		this.start = start;
		this.end = end;
	}
	
	public long getResult() {
		return result;
	}
	
	public void run() {
		for(long x = start; x <= end; x++) {
			result += x;
		}
	}
	
	
}












