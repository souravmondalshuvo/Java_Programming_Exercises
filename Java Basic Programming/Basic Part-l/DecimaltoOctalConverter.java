/*
Write a Java program to convert a decimal number to an octal number.
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17
*/

import java.util.*;
public class DecimaltoOctalConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Inout a Decimal Number: ");
        int decimal_number = sc.nextInt();

        int i = 1;
        int quotient;
        int octal_number[] = new int[100];

        quotient = decimal_number;

        while(quotient != 0) {
            octal_number[i++] = quotient % 8;
            quotient /= 8;
        }

        System.out.print("Octal Number: ");
        for(int j = i-1; j > 0; j--) {
            System.out.print(octal_number[j]);
        }

        System.out.println();
    }
}