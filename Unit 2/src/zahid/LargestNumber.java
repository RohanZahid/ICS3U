package zahid;

import java.util.Scanner;
/**
 * Largestnumber.java
 * Monday, April 3rd, 2017
 * Finds the largest number in an array.
 * @author Rohan Zahid
 */
public class LargestNumber {

	public static void main(String[] args) {
		boolean play = true;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter how many numbers you want in the array.");
			int x = scan.nextInt();
			int [] numbers = new int [x];
			System.out.println("Enter the " + x + " numbers one by one.");
			for (int i = 0; i<x; i++) {
				numbers [i] = scan.nextInt();
			}
			System.out.println("The largest number in this array is " + LargestNumber(numbers));
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
	 * Determines the largest number in an array.
	 * @param array
	 * @return The largest number of the array.
	 */
	public static int LargestNumber(int []array) {
		int largestNumber = array[0];
		for (int i = 1; i<array.length; i++) {
			if (array[i]>largestNumber) {
				largestNumber = array[i];
			}
		}
		return largestNumber;
	}

}
