import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int loopCount = 0;
        double avg;
        int even=0;
        int odd=0;
        
        while (true) {
            System.out.println("Type numbers:");
            
            
            int number = Integer.parseInt(reader.nextLine());
            sum+=number;
            loopCount++;
            if (number==-1) {
                sum++;
                loopCount--;
                System.out.println("Thank you and see you later!");
                break;
            }
            if (number%2==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers:"+loopCount);
        avg = (double)sum /loopCount;
        System.out.println("Average: "+avg);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}
