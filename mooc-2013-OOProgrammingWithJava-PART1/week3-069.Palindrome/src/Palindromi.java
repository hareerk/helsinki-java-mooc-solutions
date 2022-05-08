import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String help = "";
        int length = text.length()-1;
        while (length>=0) {
            char character = text.charAt(length);
            help = help + character;
            length--;
           
        }
        if (text.equals(help)){
            return true;
        } 
        return false;
        
        
            
        
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
