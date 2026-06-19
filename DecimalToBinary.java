import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(number);
        System.out.println(number + " to Binary: " + binary);

        // Convert binary back to decimal
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(binary + " to Decimal: " + decimal);

        sc.close();
    }
}
