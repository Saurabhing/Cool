import java.util.Scanner;
//Calculate the sum of the digits of an integer.

public class DigitalSum {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the given Number : ");
        int number = scan.nextInt();
        int sum = 0;
        while(number>=1){
            sum = (number%10)+sum;
            number = number/10;
        }
        System.out.println("Digital sum of the number :"+sum);
scan.close();
    }
}
