/*
Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
*/

import java.util.*;
public class DecimaltoBinaryConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a Decimal Number: ");
        int decimal_number = sc.nextInt();

        int quotient;
        int i = 1;
        int binary_number[] = new int[100];

        quotient = decimal_number;

        while(quotient != 0) {
            binary_number[i++] = quotient % 2;
            quotient /= 2;
        }

        System.out.print("Binary number is: ");
        for(int j = i-1; j > 0; j--) {
            System.out.print(binary_number[j]);
        }

        System.out.println();
    }
}
