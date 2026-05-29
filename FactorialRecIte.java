import java.util.Scanner;
//Calculate the Factorial of a number using recursion and iteration.

public class FactorialRecIte {
    public static int fact(int factorial){
        if(factorial==0||factorial==1){
            return 1;
        }
            return factorial * fact(factorial - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number for know Factorial");
        int factorial = sc.nextInt();
        int number = factorial;
        int result = 1;
        while(factorial>=1)
        {
            result = factorial*result;
            factorial--;
        }
        System.out.println("Factorial through Iteration :"+ result);
        //int recursiveResult = fact(number);
        System.out.println("Factorial through Recursion :"+fact(number));
    }
}
