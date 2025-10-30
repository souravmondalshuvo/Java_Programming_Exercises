/*
Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8
*/

import java.util.*;
public class OctaltoDecimalConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any Octal Number: ");
        long octal_number = sc.nextInt();

        long decimal_number = 0;
        int i = 0;

        while(octal_number != 0) {
            decimal_number = (long) (decimal_number + (octal_number % 10) * Math.pow(8, i++));
            octal_number /= 10;
        }

        System.out.print("Equivalent Decimal Number: " + decimal_number + "\n");
    }
}
