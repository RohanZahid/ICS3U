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

		//String [] alphabet = {"a", "b", "c", "d", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", };

		System.out.println("Enter one word you wanna say to your friends!");
		String [] word = scan.nextLine().split("");
		//System.out.println(word.length);


		for(int i = 0; i<word.length-1; i++){
			//if(word[i].equals(word[i+1])) {
			//	time = time +1;
			//}
			time=time +1;
			if(word[i].equals("a")||word[i].equals("d")||word[i].equals("g") || word[i].equals("j")||word[i].equals("m")||word[i].equals("p")||word[i].equals("t")||word[i].equals("w")){
				time = time +1;

			}
			if(word[i].equals("b")||word[i].equals("e")||word[i].equals("h") || word[i].equals("k")||word[i].equals("n")||word[i].equals("q")||word[i].equals("u")||word[i].equals("x")){
				time = time +2;

			}
			if(word[i].equals("c")||word[i].equals("f")||word[i].equals("i") || word[i].equals("l")||word[i].equals("o")||word[i].equals("r")||word[i].equals("v")||word[i].equals("y")){
				time = time +3;

			}
			if(word[i].equals("s")||word[i].equals("z")){
				time = time +4;

			}
			if((word[i].equals("a")||word[i].equals("b")||word[i].equals("c")) && (word[i+1].equals("a")||word[i+1].equals("b")||word[i+1].equals("c"))){
				time = time +2;

			}
			if((word[i].equals("d")||word[i].equals("e")||word[i].equals("f")) && (word[i+1].equals("d")||word[i+1].equals("e")||word[i+1].equals("f"))){
				time = time +2;

			}
			if((word[i].equals("g")||word[i].equals("h")||word[i].equals("i")) && (word[i+1].equals("g")||word[i+1].equals("h")||word[i+1].equals("i"))){
				time = time +2;

			}
			if((word[i].equals("j")||word[i].equals("k")||word[i].equals("l")) && (word[i+1].equals("j")||word[i+1].equals("k")||word[i+1].equals("l"))){
				time = time +2;

			}
			if((word[i].equals("m")||word[i].equals("n")||word[i].equals("o")) && (word[i+1].equals("m")||word[i+1].equals("n")||word[i+1].equals("o"))){
				time = time +2;

			}
			if ((word[i].equals("p") ||word[i].equals("q") ||word[i].equals("r")||word[i].equals("s")) && (word[i+1].equals("p") ||word[i+1].equals("q")|| word[i+1].equals("r") ||word[i+1].equals("s"))) {
				time=time+2;
			}
			if((word[i].equals("t")||word[i].equals("u")||word[i].equals("v")) && (word[i+1].equals("t")||word[i+1].equals("u")||word[i+1].equals("v"))){
				time = time +2;
			}
			if ((word[i].equals("w") ||word[i].equals("x") ||word[i].equals("y")||word[i].equals("z")) && (word[i+1].equals("w") ||word[i].equals("x")|| word[i+1].equals("y") ||word[i+1].equals("z"))) {
				time=time+2;
			}
			

		}	
		System.out.println(time);
	}
	
}



