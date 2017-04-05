package zahid;
import java.util.Scanner;
/**
 * PrimeNumber.java
 * Monday, April 3rd, 2017
 * Determines if a number is prime.
 * @author Rohan Zahid
 */
public class PrimeNumber {
	public static void main(String[] args) {
		boolean play = true;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number to determine if it is prime or not.");
			int x = scan.nextInt();
			System.out.println(isPrime(x));
			System.out.println("Do you want to try again? (y/n)");
			String again = scan.next();
			if (again.equalsIgnoreCase("y")) {
				play = true;
			}
			else {
				play = false;
			}
		} while (play == true);

	}
	/**
	 * Checks if a number is prime.
	 * @param x an input number.
	 * @return true/false if a number is prime.
	 * Finds the largest number in an array.
	 */
	public static boolean isPrime(int x) {
		if (x<=0)
			return false;
		else {
			for (int i = x/2; i>1; i--) {
				if (isDivisible(x,i))
					return false;
			}
			return true;
		}
	}
	/**
	 * Checks if a number is divisible.
	 * @param a an input number.
	 * @param b an input number.
	 * @return true/false if a number is divisible without remainders.
	 */
	private static boolean isDivisible(int a, int b) {
		if (a%b == 0) {
			return true;
		}
		else{
			return false;
		}

	}


}
