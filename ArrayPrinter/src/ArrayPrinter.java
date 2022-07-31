import java.util.*;

public class ArrayPrinter {
	
	public void printer(int len) {
		Random randNum = new Random();
		int[] randArray = new int[len];
		
		for(int i = 0; i < len; i++) {
			randArray[i] = randNum.nextInt(10);
			if(i == len-1)
				System.out.print(randArray[i] + ".");
			else
				System.out.print(randArray[i] + ",");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ArrayPrinter().printer(10);

	}

}
