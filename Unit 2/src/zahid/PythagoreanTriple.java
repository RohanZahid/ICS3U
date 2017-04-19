package zahid;
/**
 * PythagoreanTriple.java
 * Wednesday, April 19th, 2017
 * Outputs all possible values of a and b that produce a perfect square.
 * @author Rohan Zahid
 */
public class PythagoreanTriple {

	public static void main(String[] args) {
		System.out.print("This program will output all possible values of a and b that produce a perfect square.");
		System.out.println("The following combinations produce results:");
		System.out.println("a" + " " + "b" + " " + "c");
		for (int a = 1; a<100; a++) {
			for (int b = 1; b<100; b++) {
				int c = (int) (Math.pow(a,2) + Math.pow(b, 2));
				if (perfectSquare(c) == true) {
					int y = (int)Math.sqrt(c);
					System.out.println(a + " " + b + " " + y);
				}
			}
		}
	}
	/**
	 * Determines if a number is a perfect square.
	 * @param The input number.
	 * @return true/false the word is a perfect square.
	 */
	public static boolean perfectSquare(int x) {
		int a = (int)Math.sqrt(x);
		double check = Math.pow(a, 2);
		if (check == x) {
			return true;
		}
		return false;
	}
}
