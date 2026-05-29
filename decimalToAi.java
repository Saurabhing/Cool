import java.util.Scanner;

public class DecimalBinaryManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        // Decimal to Binary
        int n = number;
        String binary = "";
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary; // prepend remainder
            n = n / 2;
        }
        System.out.println(number + " to Binary: " + binary);

        // Binary to Decimal
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }
        System.out.println(binary + " to Decimal: " + decimal);

        sc.close();
    }
}
