import java.util.Scanner;


public class Calculator {
	
	private int rezultSum = 0;
	private int rezultSub = 0;
	private int rezultMul = 0;
	private float rezultDiv = 0;
	
	private int sum(int number1, int number2) {
		
		return number1 + number2;
	}
	private int sub(int number1, int number2) {

			return number1 - number2;
	}
	private int mul(int number1, int number2) {
		
		return number1 * number2;
	}
	private float div(int number1, int number2) {
		
		return (float)number1 / (float)number2;
	}
	
	private void calc(int num1, int num2, String operation) {

			switch(operation) {
			case "sum":
				rezultSum = this.sum(num1, num2);
				break;
			case "sub":
				rezultSub = this.sub(num1, num2);
				break;
			case "mul":
				rezultMul = this.mul(num1, num2);
				break;
			case "div":
				rezultDiv = this.div(num1, num2);
				break;
		}
	}
	
	public void choise() {
		
		System.out.println("Choise operation:\n+  enter <sum>\n-  enter <sub>\n *  enter <mul>\n /  enter <div>\n");
		Scanner input = new Scanner(System.in);
		String operationName = input.next();
		System.out.println("Enter two numbers:\nnumber 1 = ");
		int num1 = input.nextInt();
		System.out.println("number 2 = ");
		int num2 = input.nextInt();
		switch(operationName) {
			case "sum" -> {
			this.calc(num1, num2, operationName);
			System.out.println(operationName + "(" + num1 + "," + num2 + ") = " + rezultSum);
			}
			case "sub" -> {
			this.calc(num1, num2, operationName);
			System.out.println(operationName + "(" + num1 + "," + num2 + ") = " + rezultSub);
			}
			case "mul" -> {
			this.calc(num1, num2, operationName);
			System.out.println(operationName + "(" + num1 + "," + num2 + ") = " + rezultMul);
			}
			case "div" -> {
			this.calc(num1, num2, operationName);
			System.out.println(operationName + "(" + num1 + "," + num2 + ") = " + rezultDiv);
			}
			default -> System.out.println("Unknown operation");	
 		}
		input.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator clc = new Calculator();
		clc.choise();

	}

}
