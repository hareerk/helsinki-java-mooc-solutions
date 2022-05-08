
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type a number:");
        int num2 = Integer.parseInt(reader.nextLine());
        while (num1 <= num2) {
            System.out.println(num1);
            
            if (num1>=num2) {
                break;
            }
            num1++;
            
                    
                    
        }

        // write your code here

    }
}
