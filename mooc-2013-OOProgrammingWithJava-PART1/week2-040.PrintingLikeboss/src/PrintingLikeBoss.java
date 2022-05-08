public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 1;
        while (i<=amount) {
            System.out.print("*");
            i++;
            }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i=1;
        while (i<=amount) {
            System.out.print(" ");
            i++;
        }
        
        
    }

    public static void printTriangle(int size) {
        // 40
        int j=1;
        int spaces=size;
        while(j<=size) {
            printWhitespaces(spaces-1);
            printStars(j);
            j++;
            spaces--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int k=1;
        int loops=1;
        int heights=height;
        while (loops<=height) {
            printWhitespaces(heights-1);
            printStars(k);
            k=k+2;
            heights=heights-1;
            loops++;
            
            
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
