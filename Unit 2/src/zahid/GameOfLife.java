package zahid;
import java.util.Scanner;
public class GameOfLife {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String choice = "y";
		int neighbours = 0;
		int [][] arr = new int[20][20];
		System.out.println("Welcome to the Game of LIFE!"); 
		System.out.println("How many live cells would you like?"); 
		int numCells = scan.nextInt();
		for (int i = 0; i<numCells; i++) {
			System.out.println("Enter the x-coordinate.");
			int x = scan.nextInt();
			System.out.println("Enter the y-coordinate.");
			int y = scan.nextInt();
			arr[x][y] = 1;
		}
		for (int i = 0; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		for (int i = 0; i<arr.length; i++) {
			if (choice.equalsIgnoreCase("y")) {
			for (int j = 0; j<arr[i].length; j++) {
				
					//if (arr[i-1][j]==1||arr[i+1][j]==1||arr[i][j-1]==1||arr[i][j+1]==1||arr[i+1][j+1]==1||arr[i+1][j-1]==1||arr[i-1][j+1]==1||arr[i-1][j-1]==1){
					//}
					if (i == 19 && j==0) {
						if (arr[i-1][j]==1) {
							neighbours++;
						}
						if (arr[i-1][j+1]==1) {
							neighbours++;
						}
						if (arr[i][j+1]==1) {
							neighbours++;
						}
					}
					else if (i == 0 && j == 0) {
						if (arr[i][j+1]==1) {
							neighbours++;
						}
						if (arr[i+1][j+1]==1) {
							neighbours++;
						}
						if (arr[i+1][j]==1) {
							neighbours++;
						}
					}
					else if (i == 0 && j == 19) {
						if (arr[i][j-1]==1) {
							neighbours++;
						}
						if (arr[i+1][j-1]==1) {
							neighbours++;
						}
						if (arr[i+1][j]==1) {
							neighbours++;
						}
					}
					else if (i == 19 && j == 19) {
						if (arr[i][j-1]==1) {
							neighbours++;
						}
						if (arr[i-1][j-1]==1) {
							neighbours++;
						}
						if (arr[i-1][j]==1) {
							neighbours++;
						}
					}
					else if (i == 0 && (j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==10||j==11||j==12||j==13||j==14||j==15||j==16||j==17||j==18)){
						if (arr[i][j+1]==1) {
							neighbours++;
						}
						if (arr[i][j-1]==1) {
							neighbours++;
						}
						if (arr[i+1][j+1]==1) {
							neighbours++;
						}
						if (arr[i+1][j-1]==1) {
							neighbours++;
						}

					}
					else if (i == 19 && (j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==8||j==10||j==11||j==12||j==13||j==14||j==15||j==16||j==17||j==18)){
						if (arr[i][j+1]==1) {
							neighbours++;
						}
						if (arr[i][j-1]==1) {
							neighbours++;
						}
						if (arr[i-1][j+1]==1) {
							neighbours++;
						}
						if (arr[i-1][j-1]==1) {
							neighbours++;
						}

					}
					else if (j == 0 && (i==1||i==2||i==3||i==4||i==5||i==6||i==7||i==8||i==10||i==11||i==12||i==13||i==14||i==15||i==16||i==17||i==18)){
						if (arr[i+1][j]==1) {
							neighbours++;
						}
						if (arr[i-1][j]==1) {
							neighbours++;
						}
						if (arr[i+1][j+1]==1) {
							neighbours++;
						}
						if (arr[i-1][j+1]==1) {
							neighbours++;
						}

					}
					else if (j == 19 && (i==1||i==2||i==3||i==4||i==5||i==6||i==7||i==8||i==10||i==11||i==12||i==13||i==14||i==15||i==16||i==17||i==18)){
						if (arr[i+1][j]==1) {
							neighbours++;
						}
						if (arr[i-1][j]==1) {
							neighbours++;
						}
						if (arr[i+1][j-1]==1) {
							neighbours++;
						}
						if (arr[i-1][j-1]==1) {
							neighbours++;
						}

					}
					else {
						if (arr[i-1][j]==1) {
							neighbours++;
						}
						if (arr[i+1][j]==1) {
						neighbours++;
						}
						if (arr[i][j-1]==1) {
						neighbours++;
						}
						if (arr[i][j+1]==1) {
						neighbours++;
						}
						if (arr[i+1][j+1]==1) {
						neighbours++;
						}
						if (arr[i+1][j-1]==1) {
						neighbours++;
						}
						if (arr[i-1][j+1]==1) {
						neighbours++;
						}
						if (arr[i-1][j-1]==1) {
						neighbours++;
						}

					}
					if (arr[i][j] == 1) {

						if (neighbours==2||neighbours==3) {
							System.out.print(arr[i][j]);
						}
						else {
							arr[i][j] = 0;
							System.out.print(arr[i][j]);
						}

					}
					else if (arr[i][j] == 0) {
						if (neighbours==3) {
							arr[i][j] = 1;
							System.out.print(arr[i][j]);
						}
						else {
							System.out.print(arr[i][j]);
						}

					}
					//System.out.println();


				}



			}
			System.out.println();
			
		}

	
		System.out.println("Do you want to continue? (Y/N)");
		choice = scan.next();
	}
}
