package zahid;
import java.util.Scanner;
public class GameOfLife {

	public static void main(String[] args) {
		boolean play = true;
		Scanner scan = new Scanner (System.in);
		String choice = "y";


		char [][] arr = new char[19][19];
		System.out.println("Welcome to the Game of LIFE!"); 
		System.out.println("How many live cells would you like?"); 
		int numCells = scan.nextInt();
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				arr[i][j] = '0';
			}
		}
		for (int i = 0; i<numCells; i++) {
			System.out.println("Enter the x-coordinate.");
			int x = scan.nextInt();
			System.out.println("Enter the y-coordinate.");
			int y = scan.nextInt();
			arr[x][y] = 'X';

		}
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("Do you want to continue? (Y/N)");
		choice = scan.next();
		if (choice.equalsIgnoreCase("y")) {
			play = true;
		}

		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] = newPosition(arr, i, j));
			}
			System.out.println();
		}


	}

	public static char newPosition (char [][] arr, int i, int j) {
		boolean [][] array = new boolean[19][19];
		int neighbours = 0;
		if (arr[i][j]=='X') {
			if (i == 19 && j ==0){
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (arr[i-1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (neighbours==2||neighbours==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 0 && j == 0) {
				if (arr[i][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j+1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 0 && i == 19) {
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i+1][j]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i == 19 && j == 19) {
				if (arr[i][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j-1]=='X') {
					neighbours++;
				}
				if (arr[i-1][j]=='X') {
					neighbours++;
				}
				if (neighbours == 2|| neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i==0) {
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
				if (neighbours == 2|| neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (i==19) {
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
				if (neighbours == 2|| neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (j==0) {
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
				if (neighbours == 2|| neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else if (j==19) {
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
				if (neighbours == 2|| neighbours ==3) {
					return 'X';
				}
				else {
					return '0';
				}
			}
			else {
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
		else if (arr[i][j]=='0') {

			if (i == 19 && j == 0){
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
			else if (i==0 && j==0) {
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
			else if (i==0 && j==19) {
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
			else if (i == 19 && j==19) {
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
			else if (i==0) {
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
			else if (i ==19) {
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
			else if (j ==0) {
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
			else if (j ==19) {
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
			else {
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