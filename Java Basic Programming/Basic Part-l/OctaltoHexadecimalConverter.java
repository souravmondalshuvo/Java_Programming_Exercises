/*
Write a Java program to convert a octal number to a hexadecimal number.
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40
*/

import java.util.*;
public class OctaltoHexadecimalConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input a Octal Number: ");
        String octal_number = sc.nextLine();

        String hexadecimal_number;
        int decimal_number;

        decimal_number = Integer.parseInt(octal_number, 8);

        hexadecimal_number = Integer.toHexString(decimal_number);

        System.out.print("Equivalent Hexadecimal Number: " + hexadecimal_number + "\n");
    }
}
