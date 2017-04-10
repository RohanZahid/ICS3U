package zahid;

import java.util.Scanner;
/**
 * ReverseSentence.java
 * Monday, April 4th, 2017
 * Prints a sentence with all words backward.
 * @author Rohan Zahid
 */
public class ReverseSentence {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a sentence to get an output with all words written backwards.");
		String [] myString = scan.nextLine().split(" ");
		for (int i = 0; i < myString.length; i++) {
			String s = " " + myString[i];
			for (int j = s.length()-1; j>=0; j--) {
				System.out.print((s.charAt(j)));
			}
		}

	}

}
