import java.util.Random;

public class SortArray {
	
	public static void sort(int[] array) {
		
		int tempVar = 0;
		
		for(int i = 0; i < array.length; i++)
			for(int j = 0; j < array.length; j++)
				if(array[j] > array[i]) {
					tempVar = array[i];
					array[i] = array[j];
					array[j] = tempVar;
				}
		//return array;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randNum = new Random();
		int[] randArray = new int[10];
		for(int i = 0; i < randArray.length; i++) {
			randArray[i] = randNum.nextInt(10);
			System.out.print(randArray[i] + " ");
		}
		System.out.println();
		/*int[] rezult = */sort(randArray);
		for(int i : randArray)
			System.out.print(i+ " ");
			

	}

}
