import java.util.*;

public class DayOfWeek {
	
	public void randomDay() {
		
		String day = switch(new Random().nextInt(1, 7)) {
						case 1 -> "Monday";
						case 2 -> "Tuesday";
						case 3 -> "Wednesday";
						case 4 -> "Thursday";
						case 5 -> "Friday";
						case 6 -> "Saturday";
						case 7 -> "Sunday";
						default -> "Unkwnown day";
		};
		System.out.print(day);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new DayOfWeek().randomDay();

	}

}
