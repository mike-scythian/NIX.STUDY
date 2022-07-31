
public class TemperatureConverter {
	
	public int fahrenheitToCelsius(int fDegree) {
		return (5*(fDegree - 32))/9;
	}

	public static void main(String[] args) {
		
		System.out.print(new TemperatureConverter().fahrenheitToCelsius(70));
		// TODO Auto-generated method stub

	}

}
