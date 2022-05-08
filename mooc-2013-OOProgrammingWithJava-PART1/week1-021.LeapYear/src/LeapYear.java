
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year:");
        int leapYear = Integer.parseInt(reader.nextLine());
        if (((leapYear%4)==0) && ((leapYear%100)!=0)) {
            System.out.println("This year is a leap year.");
        } else if (((leapYear%100)==0) && ((leapYear%400)==0)) {
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
      

    }
}
