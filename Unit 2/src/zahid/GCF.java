package zahid;

import java.util.Scanner;
/**
 * GCF.java
 * Monday, April 3rd, 2017
 * Finds the greatest common factor of two numbers.
 * @author Rohan Zahid
 */
public class GCF {
	public static void main(String[] args) {
		boolean play = true;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter one number.");
			int x = scan.nextInt();
			System.out.println("Enter another number.");
			int y = scan.nextInt();
			System.out.println("The greatest common factor of the numbers is " + gcf(x,y));
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
	 * Finds the greatest common factor of two numbers.
	 * @param a an input number.
	 * @param b an input number.
	 * @return the number that is the greatest common factor.
	 */
	public static int gcf(int a, int b) {
		int big = Math.max(a, b);
		int small = Math.min(a, b);
		for (int i = small; i>0; i--) {
			if (isDivisible(big,i) && isDivisible(small,i)) {
				return i;
			}
		}
		return 1;
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
