package zahid;

import java.util.Scanner;
/**
 * SumOfDigits.java
 * Monday, April 3rd, 2017
 * Adds up all of the digits in a number.
 * @author Rohan Zahid
 */
public class SumOfDigits {

	public static void main(String[] args) {
		boolean play = true;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter one number to find the sum of its digits.");
			int x = scan.nextInt();
			System.out.println("The sum of digits for the number is " + SumofDigits(x));
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
	 * Finds the sum of all the digits in a number.
	 * @param x an input number
	 * @return The sum of all digits.
	 */
	public static int SumofDigits(int x) {
		int total = 0;
		while (x>0) {
			total = total + x%10;
			x = x/10;
		}
		return total;
	}

}
