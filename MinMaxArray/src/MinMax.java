import java.util.Random;

public class MinMax {
	
	public void arrayMinMax(int[] array) {
		
		int min = array[0];
		int max = array[0];
		
		for(int i : array) {
			if(i < min)
				min = i;
			if(i > max)
				max = i;
		}
		System.out.println("min = " + min);
		System.out.println("max = " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random randNum = new Random();
		int[] randArray = new int[10];
		for(int i = 0; i < randArray.length; i++) {
			randArray[i] = randNum.nextInt(100);
			System.out.print(randArray[i] + " ");
		}
		System.out.println();
		new MinMax().arrayMinMax(randArray);

	}

}
