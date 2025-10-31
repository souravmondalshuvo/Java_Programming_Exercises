/*
Write a Java program to convert a hexadecimal number into a binary number.
Input Data:
Enter Hexadecimal Number : 37
Expected Output

Equivalent Binary Number is: 110111
*/

import java.util.*;
public class HexadecimaltoBinaryConverter {

    public static int hexadecimal_to_binary(String hex) {

        String digits = "0123456789ABCDEF";

        hex = hex.toUpperCase();
        int value = 0;

        for(int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            value = 16 * value + d;
        }

        return value;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal Number: ");
        String hexadecimal_number = sc.nextLine();

        int decimal_number;
        int i = 1;
        int binry_number[] = new int[100];

        decimal_number = hexadecimal_to_binary(hexadecimal_number);

        while(decimal_number != 0) {
            binry_number[i++] = decimal_number % 2;
            decimal_number /= 2;
        }

        System.out.print("Equivalent Binary Number: ");
        for(int j = i - 1; j > 0; j--) {
            System.out.print(binry_number[j]);
        }

        System.out.println();
    }
}