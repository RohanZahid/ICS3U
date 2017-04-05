package zahid;

import java.util.Scanner;
/**
 * Factorial.java
 * Monday, April 3rd, 2017
 * Finds the factorial of a number.
 * @author Rohan Zahid
 */
public class Factorial {
	public static void main(String[] args) {
		boolean play = true;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number to determine its factorials.");
			int x = scan.nextInt();
			System.out.println(factorial(x));
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
	 * Finds the factorial of a number.
	 * @param x an input number.
	 * @return The factorial of the number.
	 */
	public static int factorial(int x) {
		if (x<0) {
			return -1;
		}
		else if (x==0){
			return 1;
		}
		else {

			int product = 1;
			for (int i = x; i>1; i--) {
				product = product*i;
			}
			return product;
		}
	}

}
