package zahid;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a sentence to get an output with all words written backwards.");
		String [] myString = scan.nextLine().split(" ");
		//String s = " " + myString[0];
		//String output = input.substring(0, 1).toUpperCase() + input.substring(1); 
		for (int i = 0; i < myString.length; i++) {
			int x = myString.length-1;
			String s = " " + myString[i];
			String b = myString[i];
			/*if (i == 0) {
				String c= b.substring(0, 1).toLowerCase();
				for (int j = s.length()-1; j>0; j--) {
					System.out.print((s.charAt(j) + c));
				}
			}
			else if (i == x) {
				String c= b.substring(0, b.length()-1).toUpperCase();
				for (int j = s.length()-1; j>0; j--) {
					System.out.print((c + s.charAt(j) + "."));
				}
			}
			else if (myString[i].contains(".")) {
				for (int j = s.length()-2; j>=0; j--) {
					System.out.print((s.charAt(j)));
				}
			}
			else {*/
			for (int j = s.length()-1; j>=0; j--) {
				if (s.contains(".")) {
					s.split(".");
					for (int j = s.length()-1; j>0; j--) {
						System.out.print((s.charAt(j) + c));
					}
				}
				else if(i == 0) {
					String c= b.substring(0, 1).toLowerCase();
					for (int j = s.length()-1; j>0; j--) {
						System.out.print((s.charAt(j) + c));
					}
				System.out.print((s.charAt(j)));
			//}
			}
				else if (i == x) {
					String c= b.substring(0, b.length()-1).toUpperCase();
					for (int j = s.length()-1; j>0; j--) {
						System.out.print((c + s.charAt(j) + "."));
					}
		}

	}

}
