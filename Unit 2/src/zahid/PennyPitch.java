package zahid;

import java.util.Scanner;

/**
 * PennyPitch.java
 * Friday, April 28th, 2017
 * Randomly generates positions for prizes on a board. Pennies are randomly generated onto the board. If all positions of a certain prize has a penny, the user wins the prize.
 * @author Rohan Zahid
 */
public class PennyPitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean play = true;
		do {
			String [][] arr = new String[5][5];
			String [][] pennyArr = new String[5][5];
			int ballPrize = 0; 
			int puzzlePrize = 0;
			int posterPrize = 0;
			int gamePrize = 0;
			int dollPrize = 0;
			for (int i = 0; i<arr.length; i++) {
				for (int j = 0; j<arr[i].length; j++) {
					arr[i][j] = "[     ]"; //Sets all values to "[     ]".
					pennyArr[i][j] = "[     ]";//Sets all values to "[     ]".
				}
			}
			for (int ball = 0; ball<3; ball++) {
				int x = (int)(Math.random() *5); //Randomly generates positions for the board.
				int y = (int)(Math.random() *5);
				while (!arr[x][y].equals("[     ]")) { //If the position is already taken, a new position is generated.
					x = (int)(Math.random() *5);
					y = (int)(Math.random() *5);
				}
				arr[x][y] = "[BALL]";
			}
			for (int puzzle = 0; puzzle<3; puzzle++) {
				int x = (int)(Math.random() *5);
				int y = (int)(Math.random() *5);
				while (!arr[x][y].equals("[     ]")) {
					x = (int)(Math.random() *5);
					y = (int)(Math.random() *5);
				}
				arr[x][y] = "[PUZZLE]";
			}
			for (int game = 0; game<3; game++) {
				int x = (int)(Math.random() *5);
				int y = (int)(Math.random() *5);
				while (!arr[x][y].equals("[     ]")) {
					x = (int)(Math.random() *5);
					y = (int)(Math.random() *5);
				}
				arr[x][y] = "[GAME]";
			}
			for (int poster = 0; poster<3; poster++) {
				int x = (int)(Math.random() *5);
				int y = (int)(Math.random() *5);
				while (!arr[x][y].equals("[     ]")) {
					x = (int)(Math.random() *5);
					y = (int)(Math.random() *5);
				}
				arr[x][y] = "[POSTER]";
			}
			for (int doll = 0; doll<3; doll++) {
				int x = (int)(Math.random() *5);
				int y = (int)(Math.random() *5);
				while (!arr[x][y].equals("[     ]")) {
					x = (int)(Math.random() *5);
					y = (int)(Math.random() *5);
				}
				arr[x][y] = "[DOLL]";
			}
			for (int i = 0; i<arr.length; i++) {
				for (int j = 0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("- - - - - - - - - - - - - - - - - - - -"); //A line is printed to divide the two boards.

			for (int i = 0; i<10; i++) { //The pennies are generated and positioned.
				int x = (int)(Math.random() *5);
				int y = (int)(Math.random() *5);
				while (!pennyArr[x][y].equals("[     ]")) {
					x = (int)(Math.random() *5);
					y = (int)(Math.random() *5);
				}
				pennyArr[x][y] = arr[x][y].replace("]", "*") + "]"; //Replaces the "]" with an "*" and ends it with a "]".
				arr[x][y] = pennyArr[x][y]; //Replaces the value in the original array with the penny locations.
			}
			for (int i = 0; i<pennyArr.length; i++) {
				for (int j = 0; j<pennyArr[i].length; j++) {
					if (arr[i][j].equals("[BALL]*")) {
						ballPrize++; //Counter is added to when a certain item has a penny.
					}
					if (arr[i][j].equals("[PUZZLE*]")) {
						puzzlePrize++; //Counter is added to when a certain item has a penny.
					}
					if (arr[i][j].equals("[GAME*]")) {
						gamePrize++; //Counter is added to when a certain item has a penny.
					}
					if (arr[i][j].equals("[POSTER*]")) {
						posterPrize++; //Counter is added to when a certain item has a penny.
					}
					if (arr[i][j].equals("[DOLL*]")) {
						dollPrize++; //Counter is added to when a certain item has a penny.
					}
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}

			System.out.println("You have won: "); //Items are outputted.
			if (ballPrize==3) {
				System.out.println("a ball.");
			}
			if (puzzlePrize==3) {
				System.out.println("a puzzle.");
			}
			if (gamePrize==3) {
				System.out.println("a game.");
			}
			if (posterPrize==3) {
				System.out.println("a poster.");
			}
			if (dollPrize==3) {
				System.out.println("a doll.");
			}
			System.out.println("Do you want to try again? (y/n)"); //Prompts the user to play again.
			String again = scan.next();
			if (again.equalsIgnoreCase("y")) {
				play = true;
			}
			else {
				play = false;
			}
		} while (play == true);
	}

}






