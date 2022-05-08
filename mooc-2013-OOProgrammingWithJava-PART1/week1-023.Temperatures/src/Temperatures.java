
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        
        while (true) {
            System.out.println("Type a number:");
            double graphNumber = Double.parseDouble(reader.nextLine());
            
            //System.out.println("type yes to go again or no to stop");
            //String runAgain = reader.nextLine();
            //if (runAgain.equals("no")){
                //break;
            //}
            if (graphNumber>-30.0 && graphNumber<40.0) {
                Graph.addNumber(graphNumber);
            }
            
            
            
            
            
        }
                
        

        // Graph is used as follows:
       // Graph.addNumber(7);
       // double value = 13.5;
       // Graph.addNumber(value);
       // value = 3;
       // Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}
