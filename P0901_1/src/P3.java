
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("한조", 30000);
		Account a2 = new Account("트레이서", 30000);
		
		a1.deposite(10000);
		a1.widthdraw(5000);
		a1.widthdraw(5000);
		a1.widthdraw(5000);
		a1.widthdraw(5000);
		a1.printInfo();
		a1.widthdraw(5000);
		a1.widthdraw(5000);
		a1.widthdraw(5000);
		a1.widthdraw(5000);
		a1.widthdraw(5000);
		a1.widthdraw(5000);
		
	}

}

class Account{
	private String name;
	private int balance;
	
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	//입금
	public void deposite(int value) {
		balance += value;	
	}
	
	private boolean isWithDrawallImpossible(int value) {
		
//		if(balance > value) {
//			return true;
//		}else {
//			return false;
//		}
		return balance<value?true:false;
	}
	//출금
	public void widthdraw(int value) {
		if(isWithDrawallImpossible(value)) {
			System.out.println("경고] 잔액이 부족합니다.");
			return;
		}
		
		balance -= value;
	}
	
	public void printInfo() {
		System.out.println(name + " 계좌는 " + balance + "남아있습니다.");
	}
	
}





