
public class Fibo {
	
	public int calc(int num) {

		if(num == 0)
			return 0;
		if(num == 1)
			return 1;
		return calc(num-1) + calc(num-2);
	}
	
	public void fiboPrinter(int limit) {
		int k = 0;
		while(this.calc(k) < limit) {
			System.out.print(this.calc(k++) + "\t");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fibo().fiboPrinter(60);

	}

}
