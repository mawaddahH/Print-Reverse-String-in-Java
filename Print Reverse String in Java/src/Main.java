import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner UserInput = new Scanner (System.in);
		String word,revWord="";
		char letter;
        System.out.print("PLEASE add any word: ");
		while(!UserInput.hasNextLine()) {
            UserInput.next();
            System.out.print("PLEASE add any word: ");
            System.err.println("You Entered INVALID input");
		}
	
		word =UserInput.nextLine();
		for (int i=0;i<word.length();i++) {
			letter=word.charAt(i);
			revWord = letter +revWord;
		}

           System.out.println("The reverse word is= "+revWord);
           System.out.println("THANK YOU");

        UserInput.close();
	}

}
