package exercise6_1;

/**
 * 
 * @author Joshua Guadagno
 * Date: 11/9/2015
 * Purpose: Define Calculator to find sum, average, product, and factorial of a group of data (e.g. array). 
 * 
 */
public class Calculator {
	public static double sum(double a, double b) {	
		return a+b;
	}
	
	public static double sum(double[] a) {
		double total = 0;
		int i;
		for(i=0; i<a.length;i++) {
			total= total + a[i];
		}
		return total;
	}

	public static double average(double a, double b) {	
		return (a+b)/2;
	}
	
	public static double average(double[] a) {
		double total =sum(a);
		double avg=total/a.length;
		return avg;
	}
	
	public static double product(double a, double b) {	
		return a*b;
	}
	
	public static double product(double[] a) {
		double total = 1;
		int i;
		for(i=0; i<a.length;i++) {
			total= total * a[i];
		}
		return total;
	}

	public static int factorial(int a) {
		int total = 1;
		int i;
		for(i=a;i>0;i--) {
			total= total *i;
		}
		return total;
	}

}
