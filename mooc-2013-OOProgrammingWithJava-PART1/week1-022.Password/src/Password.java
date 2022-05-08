
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";// Use carrot as password when running tests.
        while (true) {
            System.out.println("Type the password:");
            if (reader.nextLine().equals(password)) {
                System.out.println("Right! The secret is: carrots are good for you");
                break;
            } else {
                System.out.println("Wrong!");
            }
                
        }
        

        // Write your code here
    }
}
