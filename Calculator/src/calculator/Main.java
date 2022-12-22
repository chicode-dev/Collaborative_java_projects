package calculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		double firstNumber, secondNumber, answer = 0.0;
		System.out.println("Enter first number: ");
		firstNumber = Input.nextDouble();
		System.out.println("Enter Second number: ");
		secondNumber = Input.nextDouble();
		System.out.println("Enter Operation");
		String oper = Input.next();
		if (oper.equals("+")) {
			answer = firstNumber + secondNumber;
		}
		else if (oper.equals("-")) {
			answer = firstNumber - secondNumber;
		}
		else if (oper.equals("/")) {
			answer = firstNumber / secondNumber;
		}
		else if (oper.equals("*")) {
			answer = firstNumber * secondNumber;
		}else {
			System.out.println("Wrong operation");
		}
		System.out.println(answer);
		Input.close();
	}

}
