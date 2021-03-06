public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
            int i = 1;
            while (i<=amount) {
                System.out.print("*");
                i++;
            }
            System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int j = 1;
        while (j<=sideSize) {
            printStars(sideSize);
            j++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int k = 1;
        while (k<=height) {
            printStars(width);
            k++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int l=0;
        while (l<size) {
            printStars(l+1);
            l++;
            
        }
                
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
