
public class FloydTriangle {
	
	public void trianglePrinter(int n) {
		
		int k = 1;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print(k++ + " ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new FloydTriangle().trianglePrinter(5);
	}

}
