import java.util.Scanner;

public class decimalToO {
    static void main(String[] args) {
        int  result = 0,rem = 0,rev = 0,decimal = 0;
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int orig = number;
        while(number>=1){
            rem = number%2;
            number = number/2;
            result = result*10+rem;
        }
        while(result>=1){
            rem = result%10;
            result = result/10;
            rev = rev*10+rem;
        }

        System.out.println(orig +" to Binary :"+ rev);
        number = rev;
        while(rev>=1){
            rem = rev%10;
            rev = rev/10;
            decimal = (decimal*2)+rem;

        }
        System.out.println(orig +" to decimal :"+decimal);

    }
}
