
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String word = reader.nextLine();
        System.out.println("Type a second word:");
        String secondWord = reader.nextLine();
        int result = word.indexOf(secondWord);
        if (result>-1) {
            System.out.println("The word '"+secondWord+"' is found in the word '"+word+"'.");
        } else {
            System.out.println("The word '"+secondWord+"' is not found in the word '"+word+"'.");
        }
    }
}
