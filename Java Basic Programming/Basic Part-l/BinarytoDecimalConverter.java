/* 
Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4
*/

import java.util.*;
public class BinarytoDecimalConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        long binary_number = sc.nextLong();

        long decimal_number = 0;
        long j = 1;
        long remainder;

        while(binary_number != 0) {
            remainder = binary_number % 10;
            decimal_number = decimal_number + remainder * j;
            j *= 2;
            binary_number /= 10;
        }

        System.out.println("Decimal Number: " + decimal_number);
    }
}