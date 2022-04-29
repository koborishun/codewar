package seven;
//Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.

//
//a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
//
//The four operators are "add", "subtract", "divide", "multiply".
//
//A few examples:(Input1, Input2, Input3 --> Output)
//
//5, 2, "add"      --> 7
//5, 2, "subtract" --> 3
//5, 2, "multiply" --> 10
//5, 2, "divide"   --> 2.5
//Try to do it without using if statements!

public class MakeAFunctionThatDoesArithmetric {
	public static void main(String[] args) {
		System.out.println(arithmetic(1, 2, "add"));
		System.out.println(arithmetic(8, 2, "subtract"));
		System.out.println(arithmetic(5, 2, "multiply"));
		System.out.println(arithmetic(8, 2, "divide"));

	}

	public static int arithmetic(int a, int b, String operator) {
		// your code here
		int result = 0;
		switch (operator.toLowerCase()) {
		case "add":
			result = a + b;
			break;
		case "subtract":
			result = a - b;
			break;
		case "multiply":
			result = a * b;
			break;
		case "divide":
			result = a / b;
			break;
		}
		return result;

	}
}
