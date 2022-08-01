import java.util.Random;

public class AverageValue {
	
	public float average(int[] array) {
		
		int sum = 0;
		for(int i : array)
			sum += i;
		return (float)sum / (float)array.length;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random randNum = new Random();
		int[] randArray = new int[9];
		for(int i = 0; i < randArray.length; i++){
			randArray[i] = randNum.nextInt(20);
			System.out.print(randArray[i] + " ");
		}
		System.out.println("\n" + new AverageValue().average(randArray));
	}

}
