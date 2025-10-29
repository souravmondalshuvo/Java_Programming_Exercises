/*
Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
*/

import java.util.*;
public class BinaryAddition {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        long first_binary = sc.nextLong();
        System.out.print("Input second binary number: ");
        long second_binary = sc.nextLong();

        int index = 0;
        int remainder = 0;

        int sum[] = new int[20];

        while(first_binary != 0 || second_binary != 0) {
            sum[index++] = (int) ((first_binary % 10 + second_binary % 10 + remainder) % 2);
            remainder = (int) ((first_binary % 10 + second_binary % 10 + remainder) / 2);
            first_binary /= 10;
            second_binary /= 10;
        }

        if(remainder != 0) {
            sum[index++] = remainder;
        }

        index--;

        System.out.print("Sum of two binary numbers: ");
        while (index >= 0) { 
            System.out.print(sum[index--]);
        }

        System.out.println();

        sc.close();
    }
}