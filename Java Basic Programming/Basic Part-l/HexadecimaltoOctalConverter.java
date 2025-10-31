/*
Write a Java program to convert a hexadecimal value into an octal number.
Input Data:
Input a hexadecimal number: 40
Expected Output

Equivalent of octal number is: 100
*/

import java.util.*;
public class HexadecimaltoOctalConverter {

    public static int hexadecimal_to_octal(String hex) {

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

        System.out.print("Input a Hexadecimal Number: ");
        String hexadecimal_number = sc.nextLine();

        int decimal_number;
        int i = 1;
        int octal_number[] = new int[100];
        
        decimal_number = hexadecimal_to_octal(hexadecimal_number);

        while(decimal_number != 0) {
            octal_number[i++] = decimal_number % 8;
            decimal_number /= 8;
        }

        System.out.print("Equivalent of Octal Number: ");
        for(int j = i - 1; j > 0; j--) {
            System.out.print(octal_number[j]);
        }

        System.out.println();
    }
}