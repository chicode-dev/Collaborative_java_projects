package calculator;

import java.util.Stack;
import java.util.Scanner;

public class Main {

  // Evaluates the given expression using the Shunting Yard algorithm
  public static double evaluate(String expression) {
    // Create a stack for holding operators
    Stack<Character> operatorStack = new Stack<>();

    // Create a stack for holding operands
    Stack<Double> operandStack = new Stack<>();
    
    
    // Iterate through the characters in the expression
    for (int i = 0; i < expression.length(); i++) {
      char ch = expression.charAt(i);

      // If the character is a digit, push it onto the operand stack
      if (Character.isDigit(ch)) {
        operandStack.push((double) ch - '0');
      } else {
        // If the character is an operator, push it onto the operator stack
        operatorStack.push(ch);
      }
    }

    // While there are still operators on the stack, pop the top two operands and
    // the top operator, and apply the operator to the operands. Push the result
    // back onto the operand stack.
    while (!operatorStack.isEmpty()) {
      double operand2 = operandStack.pop();
      double operand1 = operandStack.pop();
      char operator = operatorStack.pop();

      double result = 0;
      switch (operator) {
        case '+':
          result = operand1 + operand2;
          break;
        case '-':
          result = operand1 - operand2;
          break;
        case '*':
          result = operand1 * operand2;
          break;
        case '/':
          result = operand1 / operand2;
          break;
      }

      operandStack.push(result);
    }

    // The result is the top value on the operand stack
    return operandStack.pop();
  }

  public static void main(String[] args) {
    // Evaluate the expression "2 + 3 * 4"
	Scanner Input = new Scanner(System.in);
	String expression = Input.next();

    double result = evaluate(expression);
    System.out.println(result); // prints 14.0
  }
}

