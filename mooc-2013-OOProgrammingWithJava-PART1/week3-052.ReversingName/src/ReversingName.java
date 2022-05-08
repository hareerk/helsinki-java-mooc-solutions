import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a name:");
        String name = reader.nextLine();
        int count = 0;
        int len = name.length();
        while (count<name.length()) {
            System.out.print(name.charAt(len-1));
            count++;
            len--;
        }
    }
}
