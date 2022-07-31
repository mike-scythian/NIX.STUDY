
public class MultiTable {
	
	public void tablePrinter() {
		
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++)
				System.out.print((j * i) + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MultiTable().tablePrinter();
	}

}
