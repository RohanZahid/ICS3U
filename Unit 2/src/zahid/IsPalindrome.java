package zahid;
import java.util.Scanner;
/**
 * IsPalindrome.java
 * Thursday, April 13th, 2017
 * Determines if a word is a palindrome.
 * @author Rohan Zahid
 */
public class IsPalindrome {

	public static void main(String[] args) {
		boolean play = true;
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a word to determine if it is a palindrome.");
			String test = scan.nextLine();
			if (isPalindrome(test) == true) {
				System.out.println(test + " is a palindrome.");
			}
			else {
				System.out.println(test + " is not a palindrome.");
			}
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
	 * Determines if a word is a palindrome.
	 * @param The input word.
	 * @return true/false the word is a palindrome.
	 */
	public static boolean isPalindrome(String test) {
		String s = "";
		for (int i = test.length()-1; i>=0; i--) {
			s = s + test.charAt(i);
		}
		if (test.equals(s)) {
			return true;
		}
		return false;
	}
}
