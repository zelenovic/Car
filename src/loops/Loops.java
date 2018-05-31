
package loops;


public class Loops {
    
    public static void testWhileLoop() {
        int x = 4;
        while (x > 0) {
            System.out.println("Value of x: " + x);
            x--;
        }
        System.out.println("Value of x after while loop: " + x);
    }
    
    public static void testDoWhileLoop() {
        int y = 6;
        
        do {
            System.out.println("Value of y is: " + y);
            y--;
        } while (y > 3);
    }
    
    public static void testForLoop() {
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i: " + i);
        }
        
    }
    
    public static void testDoubleForLoop() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
            
        }
    }
    
    public static void testMultiplicationTable() {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
    
    public static void printCoordinates() {
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= 10; j++) {
                if (i<10) {
                    System.out.print(" (" + i + ", " + j + ")  ");
                } else {
                    System.out.print("(" + i + ", " + j + ")  ");
                }
                
            }
            System.out.println("");
        }
    }
    
}
