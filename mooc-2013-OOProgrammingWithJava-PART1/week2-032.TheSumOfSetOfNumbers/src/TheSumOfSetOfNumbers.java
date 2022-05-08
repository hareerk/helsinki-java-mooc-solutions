
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i=1;
        int total=0;
        System.out.println("Type a number:");
        int number = Integer.parseInt(reader.nextLine());
        while (i <=number) {
            total=i+total;
            i++;
            
                    
        
            
               
            
            
        }
        System.out.println("Sum is "+ total);
        

    }
}
