
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int i = 1;
        int num = Integer.parseInt(reader.nextLine());
        while (i<= num ) {
            i++;
            System.out.println(i-1);
            
        }
        
        // Write your code here
        
    }
}
