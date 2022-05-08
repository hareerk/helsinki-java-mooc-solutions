import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int greatest = list.get(0);
        
        for (Integer number: list){
            if (number>greatest){
                greatest=number;
            
            }
        }
        return greatest;
        /*for (int i=0; i < list.size(); i++){
            greatest = list.get(i);
            compare = list.get(i+1);
            if (greatest>compare) {
                greatest = list.get(i);
            } else {
                greatest=compare;
            }
        }*/
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
