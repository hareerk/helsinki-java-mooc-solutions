
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        if (num1 > num2) {
            System.out.println("The bigger number of the two given was: "+num1);
        } else {
            System.out.println("The bigger number of the two given was: "+num2);
        }
               

        // Implement your program here. Remember to ask the input from user
    }
}
