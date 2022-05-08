import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i=0; i<list.size(); i++){
            sum = sum + list.get(i);
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        double size = list.size();
        return (sum/size);
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        
        double avg = average(list);
        double elements = list.size();
        double newListItem = 0.0;
        for (Integer number: list){
            newListItem = newListItem+Math.pow(number-avg,2);
            
        }
        
        return newListItem/(elements-1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
