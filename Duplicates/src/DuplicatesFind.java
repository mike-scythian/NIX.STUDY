import java.util.Arrays;
import java.util.Random;

public class DuplicatesFind {
	
	public static int[] arrayCreate(int len) {
		Random randNum = new Random();
		int[] randArray = new int[len];
		for(int i = 0; i < randArray.length; i++) 
			randArray[i] = randNum.nextInt(10);
		return randArray;
	}
	
	public int[] duplFind(int[] array){
		
		int len = 0;
		int temp = 0;
		
		Arrays.sort(array);
		for(int i=0; i < array.length-1;)
			if(array[i] == array[i+1]) {
				temp = array[i];
				len++;
				while(array[i] == temp) {
					i++;
					if(i == array.length)
						break;
				}
			}
			else
				i++;
		int[] rezult = new int[len];
		int i = 0;
		int k = 0;
		while(i < array.length-1) {
			if(array[i] == array[i+1]) {
				rezult[k] = array[i];
				while(rezult[k] == array[i]) {
					i++;
					if(i == array.length)
						break;
				}
				if(k != len)
					k++;
				else
					break;
			}
			else
				i++;
		}
		return rezult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = arrayCreate(20);
		System.out.println(Arrays.toString(arr));
		int[] arr2 = new DuplicatesFind().duplFind(arr);
		System.out.print(Arrays.toString(arr2));

	}

}
