package exercise6_1;

/**
 * 
 * @author Joshua Guadagno
 * Date:11/9/2015
 * Purpose: Driver class that will test sum, average, product, and factorial methods that you have implemented in Calculator class.
 *
 */
public class CalculatorDriver {
	public static String prettyPrintArray(double[] a) {
		StringBuilder sb= new StringBuilder();
		int i;
		for (i = 0; i < a.length; i++) {
			sb.append(a[i] + ",");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		double[] myArray = new double[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		double resultVal;

		System.out.println("For the numbers " + prettyPrintArray(myArray));
		resultVal = Calculator.sum(myArray);
		System.out.println("\tThe sum is: " + resultVal);
		resultVal = Calculator.average(myArray);
		System.out.println("\tThe average is: " + resultVal);
		resultVal = Calculator.product(myArray);
		System.out.println("\tThe product is: " + resultVal);
		System.out.println("For the number " + myArray[5]);
		resultVal = Calculator.factorial((int) myArray[5]);
		System.out.println("\tThe factorial is: " + resultVal);

		double num1, num2;
		num1 = 4;
		num2 = 8;
		System.out.println("\nFor the numbers " + num1 + " and " + num2);
		resultVal = Calculator.sum(num1, num2);
		System.out.println("\tThe sum is: " + resultVal);
		resultVal = Calculator.average(num1, num2);
		System.out.println("\tThe average is: " + resultVal);
		resultVal = Calculator.product(num1, num2);
		System.out.println("\tThe product is: " + resultVal);
		System.out.println("For the number " + num2);
		resultVal = Calculator.factorial((int) num2);
		System.out.println("\tThe factorial is: " + resultVal);
	}
}
