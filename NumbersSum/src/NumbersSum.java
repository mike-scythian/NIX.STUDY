
public class NumbersSum {
	
	public int numSum(int number) {
		if(number < 10)
			return number;
		return (number % 10) + numSum(number/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(new NumbersSum().numSum(1253697));

	}

}
