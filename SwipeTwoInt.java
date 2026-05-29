//Swap two numbers without using a third variable.
import java.util.Scanner;

public class SwipeTwoInt {
    static void main(String[] args) {
        int x,y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the 1st Number :");
        x = scan.nextInt();
        System.out.print("Enter the 2st Number :");
        y = scan.nextInt();

        System.out.println("Value of x :"+ x+" Value of y :"+ y);
        x = x-y;
        y = x+y;
        x = y-x;
        System.out.println("Now Value of x :"+ x+" Now Value of y :"+ y);
    }

}
