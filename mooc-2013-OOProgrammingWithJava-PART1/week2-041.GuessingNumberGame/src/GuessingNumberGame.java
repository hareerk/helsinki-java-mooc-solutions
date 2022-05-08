
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number:");
        int count =0;
        int number = Integer.parseInt(reader.nextLine());
        while (true) {
            
            if (number>numberDrawn) {
                count++;
                System.out.println("The number is lesser, guesses made: "+count);
                
                
            } else if (number<numberDrawn) {
                count++;
                System.out.println("The number is greater, guesses made: "+count);
                
                      
            } else {
                count++;
                System.out.println("Congratulations, your guess is correct! Guesses made: "+count);
                break;
            }
            System.out.println("Guess a number:");
            number = Integer.parseInt(reader.nextLine());
            
        }    
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
