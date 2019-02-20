import java.util.Scanner;

/**
 *
 * @author aaron
 */
public class Fibonacci_Sequence {
    
    public static void main(String[] args) {
    
    int upto;
    int fibo = 0;
    int fibo2 = 1;

    // scanner to ask the user to enter the highest fibonacci number to go up to
    Scanner readin = new Scanner(System.in);
    System.out.println("Enter the number to display the Fibonacci Sequence to");
    upto = readin.nextInt();
    readin.close();
   
    // iterates from 0 to the number the user entered 
    // and displays the fibonacci numbers up to that number
    for (int i= 0; i < upto; i++) {
        fibo = fibo + fibo2;
        fibo2 = fibo - fibo2;
        if (fibo2 <= upto) {
            System.out.println(fibo2);
        } else {
            System.exit(1);
        }
    }   
}   
}
