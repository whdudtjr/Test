
public class practice4 {

	public static void main(String[] args) {
		int a = 2;
		while (a <= 9){
			if (a == 6 || a == 7){
				a++;
				continue;	
			}
			int b = 1;
			while (b <= 9) {
				System.out.println(a + "X" + b + "=" + a*b);
				b++;
			}
			a++;
		}

	}

}
