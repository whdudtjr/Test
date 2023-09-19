package p8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FFF f1 = new FFF();
		f1 = new GGG();
		
		AAA a1;
		a1 = new AAA();
		a1 = new CCC();
		a1 = new EEE();
		a1 = new FFF();
		a1 = new GGG();
		
		BBB b1 = new BBB();
		b1 = new DDD();
	}

}
class AAA{}
class BBB{}
class CCC extends AAA{}
class DDD extends BBB{}
class EEE extends CCC{}
class FFF extends CCC{}
class GGG extends FFF{}












