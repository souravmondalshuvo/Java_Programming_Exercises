/*
Write a Java program to convert a binary number to a hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D
*/

import java.util.*;
public class BinarytoHexadecimalConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Binary Number: ");
        int binary_number = sc.nextInt();

        int i = 1;
        int remainder;
        int decimal_number = 0;
        int[] hex = new int[1000];

        while(binary_number > 0) {
            remainder = binary_number % 2;
            decimal_number = decimal_number + remainder * i;
            i *= 2;
            binary_number /= 10;
        }

        i=0;

        while(decimal_number != 0) {
            hex[i] = decimal_number % 16;
            decimal_number /= 16;
            i++;
        }

        System.out.print("HexaDecimal Value: ");
        for(int j = i - 1; j >= 0; j--) {
            if(hex[j] > 9) {
                System.out.print((char) (hex[j] + 55));
            } else {
                System.out.print(hex[j]);
            }
        }

        System.out.println();
    }
}