import java.util.Random;

public class InvArray {
	
	public int[]inversion (int[] array){
		int[] rezult = new int[array.length];
		for(int i = array.length-1, j = 0; i >= 0; i--)
			rezult[j++] = array[i];
		return rezult;
		
	}
	
	public static int[] arrayCreate(int len) {
		Random randNum = new Random();
		int[] randArray = new int[len];
		for(int i = 0; i < randArray.length; i++) 
			randArray[i] = randNum.nextInt(10);
		return randArray;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = arrayCreate(20);
		int[] arr2 = new InvArray().inversion(arr);
		
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
		for(int i : arr2)
			System.out.print(i + " ");
	}

}
