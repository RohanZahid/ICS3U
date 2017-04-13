package zahid;
import java.util.Scanner;
public class CellPhoneMessaging {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = 0;
		String [] keyTwo = {"a","b","c"};
		String [] keyThree = {"d", "e", "f"};
		String [] keyFour = {"g", "h", "i"};
		String [] keyFive = {"j", "k", "l"};
		String [] keySix = {"m", "n", "o"};
		String [] keySeven = {"p", "q", "r", "s"};
		String [] keyEight = {"t", "u", "v"};
		String [] keyNine = {"w", "x", "y", "z"};
		
		String [] alphabet = {"a", "b", "c", "d", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", };

		System.out.println("Enter one word you wanna say to your friends!");
		String [] word = scan.nextLine().split("");
		System.out.println(word.length);
		

		for(int i = 0; i<word.length; i++){
			
		if((word[i].equals("a")||word[i].equals("b")||word[i].equals("c")) && (word[i+1].equals("a")||word[i=1].equals("b")||word[i=1].equals("c"))){
			time = time +2;
			
		}
		
	
		if (word[i].equals("a") ||word[i].equals("d") ||word[i].equals("g")||word[i].equals("j") ||word[i].equals("m") ||word[i].equals("p")|| word[i].equals("t") ||word[i].equals("w")) {
					time=time+1;
				}

		else if (word[i].equals("b") ||word[i].equals("e") ||word[i].equals("h")||word[i].equals("k") ||word[i].equals("n") ||word[i].equals("q")|| word[i].equals("u") ||word[i].equals("x")){
					time=time+2;

				}
		else if (word[i].equals("c") ||word[i].equals("f") ||word[i].equals("i")||word[i].equals("l") ||word[i].equals("o") ||word[i].equals("r")|| word[i].equals("v") ||word[i].equals("y")){
					time=time+3;
				}
		else if (word[i].equals("s") ||word[i].equals("z")){
					time=time+4;
				
			}	
		}
		System.out.println(time);
	}
}


