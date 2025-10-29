/*
Write a Java program to convert a decimal number to a hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F
*/

import java.util.*;
public class DecimaltoHexadecimalConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Decimal Number: ");
        int decimal_number = sc.nextInt();

        int remainder;
        String hexadecimal_number = "";

        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while(decimal_number > 0) {
            remainder = decimal_number % 16;
            hexadecimal_number = hex[remainder] + hexadecimal_number;
            decimal_number /= 16;
        }

        System.out.print("Hexadecimal Number is: " + hexadecimal_number + "\n");
    }
}