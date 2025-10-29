/*
Write a Java program to convert a binary number to an octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7
*/

import java.util.*;
public class BinarytoOctalConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        int binary_number = sc.nextInt();

        int remainder;
        int quotient;
        int decimal_number = 0;
        int i = 1;
        int octal_number[] = new int[1000];

        while(binary_number > 0) {
            remainder = binary_number % 10;
            decimal_number = decimal_number + remainder * i;
            i *= 2;
            binary_number /= 10;
        }

        i = 1;
        quotient = decimal_number;

        while(quotient > 0) {
            octal_number[i++] = quotient % 8;
            quotient /= 8;
        }

        System.out.print("Octal Number: ");
        for(int j = i - 1; j > 0; j--) {
            System.out.print(octal_number[j]);
        }

        System.out.println();
    }
}