package zahid;

import java.util.Scanner;

public class FrankensteinsMonster {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line about Frankenstein with periods instead of spaces.");
		String[] frank = scan.nextLine().split("[.]");
		for(int i = 0;i<frank.length; i++) {
			if (frank[i].equals("Frankenstein")) {
				frank[i] = "Frankenstein's.Monster";
			}
			
			System.out.print(frank[i] + ".");
		}
	}
}
