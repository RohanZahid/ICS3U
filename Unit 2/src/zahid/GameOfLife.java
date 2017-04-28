package zahid;
/**
 * GameOfLife.java
 * Friday, April 28th, 2017
 * The generated world is a two-dimensional array. Each cell may be empty or contain a single creature. Each day, creatures are born or die in each cell according to the number of neighbouring creatures on the previous day.
 * @author Rohan Zahid
 */
import java.util.Scanner;
public class GameOfLife {

	public static void main(String[] args) {
		int counter = 0; //Keeps track of alive cells.
		boolean play = true; //If false, the game is exited.
		Scanner scan = new Scanner (System.in);
		String choice; //The variable that holds the user's choice to continue.
		char [][] newArray = new char[20][20]; //An array that holds the new positions of the cells.
		char [][] arr = new char[20][20]; //An array that holds the original positions and is outputted.
		System.out.println("Welcome to the Game of LIFE!"); 
		System.out.println("How many live cells would you like?"); 
		int numCells = scan.nextInt(); //Holds the number of live cells the user wants.
		//Gives the cells of the initial array a value of 0.
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				arr[i][j] = '0';
			}
		}
		//Asks the user for the coordinates to the live cells.
		for (int i = 0; i<numCells; i++) {
			System.out.println("Enter the x-coordinate.");
			int x = scan.nextInt();
			System.out.println("Enter the y-coordinate.");
			int y = scan.nextInt();
			arr[x][y] = 'X';

		}
		//The initial array is outputted.
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		//This do-while loop repeatedly prints out the next generation of cells until 'quit' is entered or all cells die.
		do {
			counter = 0; //The counter is reset.
			System.out.println("Enter 'next' if you want to continue. Enter 'quit' if you want to exit.");
			choice = scan.next();
			if (choice.equalsIgnoreCase("next")) {
				play = true;
				for (int i = 0; i<arr.length; i++) {
					for (int j = 0; j<arr[i].length; j++) {
						newArray[i][j] = newPosition(arr, i, j);
					}
				}
				for (int i = 0; i<arr.length; i++) {
					for (int j = 0; j<arr[i].length; j++) {
						System.out.print(arr[i][j] = newArray[i][j]);
						System.out.print(" ");
					}
					System.out.println();
				}
				for (int i = 0; i<arr.length; i++) {
					for (int j = 0; j<arr[i].length; j++) {
						if(arr[i][j] == 'X') {
							counter++;
						}
					}
				}
				if (counter == 0) {
					System.out.println("All cells are dead.");
					play = false;
				}
				else {

				}
			}
			else {
				play = false;
			}

		} while(play == true);
	}
	/**
	 * Applies the necessary changes to the status of the cells. 
	 * @param arr 
	 * @param i the row
	 * @param j the column
	 * @return alive or dead ('X'/'0')
	 */
	public static char newPosition (char [][] arr, int i, int j) {
		int neighbours = 0; //Holds the value of number of neighbours.
		if (arr[i][j]=='X') { //If cell is alive, the following is done. 
			if (i == 19 && j ==0){ //If cell is in the bottom-left corner.
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (arr[i-1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (neighbours == 2||neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 0 && j == 0) { //If cell is in the upper-left corner.
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 0 && j == 19) { //If cell is in the upper-right corner.
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 19 && j == 19) { //If cell is in the bottom-right corner.
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i==0) { //If cell is in top edge.
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i==19) { //If cell is in bottom-edge.
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (j==0) { //If cell is in left-edge.
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (j==19) { //If cell is in right-edge.
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else { //If cell is in the rest of the array (middle).
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours == 3) {
					return 'X';
				}
				else {
					return '0';
				}

			}
		}
		else if (arr[i][j]=='0') { //If cell is dead, the following is done.

			if (i == 19 && j == 0){ //If cell is in bottom-left corner.
				if (arr[18][0]=='X') {
					neighbours++;
				}
				if (arr[18][1]=='X') {
					neighbours++;
				}
				if (arr[18][1]=='X') {
					neighbours++;
				}
				if (neighbours==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 0 && j == 0) { //If cell is in upper-left corner.
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 0 && j == 19) { //If cell is in upper-right corner.
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 19 && j == 19) { //If cell is in bottom-right corner.
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}

			else if (i == 0) { //If cell is in top edge.
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 19) { //If cell is in bottom-edge.
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (j ==0) { //If cell is in left-edge.
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (j ==19) { //If cell is in right-edge.
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else { //If cell is in the rest of the array (middle).
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
		}
		System.out.println();

		return 0;

	}
}