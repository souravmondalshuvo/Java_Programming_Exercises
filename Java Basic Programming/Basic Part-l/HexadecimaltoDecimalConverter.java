/*
Write a Java program to convert a hexadecimal value into a decimal number.
Input Data:
Input a hexadecimal number: 25
Expected Output

Equivalent decimal number is: 37
*/

import java.util.*;
public class HexadecimaltoDecimalConverter {

    public static int hexadecimal_to_decimal(String hex_number) {

        String digits = "0123456789ABCDEF";

        hex_number = hex_number.toUpperCase();
        int value = 0;

        for(int i = 0; i < hex_number.length(); i++) {
            char c = hex_number.charAt(i);
            int d = digits.indexOf(c);
            value = 16 * value + d;
        }

        return value;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Hexadecimal Number: ");
        String hexadecimal_number = sc.nextLine();

        int decimal_number;
        
        decimal_number = hexadecimal_to_decimal(hexadecimal_number);

        System.out.print("Equivalent Decimal Number: " + decimal_number + "\n");
    }
}