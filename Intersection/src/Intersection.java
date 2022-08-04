import java.util.*;

public class Intersection {
	
	public static int[] arrayCreate(int len) {
		Random randNum = new Random();
		int[] randArray = new int[len];
		for(int i = 0; i < randArray.length; i++) 
			randArray[i] = randNum.nextInt(10);
		return randArray;	
	}
	
	public static int[] duplicates(int[] array){
		
		int[] tempArray = new int[array.length];
		boolean flag = false;
		int k = 0;
		int buffer;
		int ii = 0;
		do {
			buffer = array[ii];
			for(int i=ii+1; i< array.length; i++) 
				if(array[i] == buffer) {
					for(int j = 0; j< tempArray.length; j++)
						if(array[i] == tempArray[j] && array[i] != 0) {
							flag = true;
							break;
						}
					if(flag == false)
						tempArray[k++] = array[i];
				}
			flag = false;
			ii++;
		}while(ii < array.length-1);
		
		int[] rezult = new int[k];
		
		for(int i=0; i<k; i++)
			rezult[i] = tempArray[i];
		return rezult;
	}
	
	public static int[]  removeDuplicates(int[] array) {
		
		Arrays.sort(array);
		
		int count = 0;
		for(int i=1; i<array.length; i++)
			if(array[i] == array[i-1])
				count++;
		if(count == 0)
			return array;
		int[] rezult = new int[array.length - count];
		for(int i=0, k=0; i < array.length-1; i++)
			if(array[i] != array[i+1])
				rezult[k++] = array[i];
		rezult[rezult.length-1] = array[array.length-1];
		return rezult;
	}
	
	public int[] intersecFind(int[] arr1, int[] arr2) {
		
		int len;
		
		if(arr1.length > arr2.length)
			len = arr1.length;
		else
			len = arr2.length;
			
		
		int[] rezult = new int[len];
		int k = 0;
		
		for(int i : arr1)
			for(int j: arr2)
				if(i == j) {
					rezult[k++]=i;
					break;
				}
		int[] rezult2 = new int[k];
		for(int i=0;i<k;i++)
			rezult2[i] =rezult[i];
	
		return removeDuplicates(rezult2);
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = arrayCreate(10);
		int[] array2 = arrayCreate(8);
		Intersection inter = new Intersection();
		int[] array = inter.intersecFind(array1, array2);
		
		System.out.println(Arrays.toString(array1));
		//System.out.println(Arrays.toString(duplicates(array1)));
		System.out.println(Arrays.toString(array2));
		
		System.out.println(Arrays.toString(array));
		

	}

}
