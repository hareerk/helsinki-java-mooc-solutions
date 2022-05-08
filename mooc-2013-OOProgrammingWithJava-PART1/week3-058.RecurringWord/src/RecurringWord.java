
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList ;
        ArrayList<String> array = new ArrayList<String>();
        while (true) {
            System.out.println("Type a word:");
            String word = reader.nextLine();
            
            if (array.contains(word)) {
                System.out.println("You used the word "+word+" twice");
                break;
            }
            array.add(word);
        }
        
    }
}
