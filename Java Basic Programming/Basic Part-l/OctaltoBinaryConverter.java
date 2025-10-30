/*
Write a Java program to convert a octal number to a binary number.
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111
*/

import java.util.*;
public class OctaltoBinaryConverter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input any Octal Number: ");
        long octal_number = sc.nextLong();

        long binry_number;
        long temp_octal_number;
        long place;
        int remainder;
        int octal_number_values[] = {0, 1, 10, 11, 100, 101, 110, 111};

        temp_octal_number = octal_number;
        binry_number = 0;
        place = 1;

        while(temp_octal_number != 0) {
            remainder = (int) (temp_octal_number % 10);
            binry_number = octal_number_values[remainder] * place + binry_number;
            temp_octal_number /= 10;
            place *= 1000;
        }

        System.out.print("Equivalent Bianry Number: " + binry_number + "\n");
    }
}
