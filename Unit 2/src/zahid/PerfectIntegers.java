package zahid;
/**
 * PerfectIntegers.java
 * Wednesday, April 19th, 2017
 * Outputs all perfect integers from 1 to 1000.
 * @author Rohan Zahid
 */
public class PerfectIntegers {
	public static void main(String[] args) {
		System.out.println("The following are perfect integers from 1 to 1000:");
		for (int a = 1; a < 1000; a++) {
			int factors = 0;
			for (int b = 1; b < a; b++) {
				if (isDivisible(a,b)) {
					factors = factors + b;
				}
			}
			if (factors == a) {
				System.out.println(factors);
			}
		}
	}

	private static boolean isDivisible(int a, int b) {
		if (a%b == 0) {
			return true;
		}
		else{
			return false;
		}

	} 
}
