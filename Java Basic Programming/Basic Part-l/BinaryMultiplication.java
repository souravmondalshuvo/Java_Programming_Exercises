/*
Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output

Product of two binary numbers: 110
*/

import java.util.*;
public class BinaryMultiplication {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first binary number: ");
        long first_binary = sc.nextLong();
        System.out.print("Input the second binary number: ");
        long second_binary = sc.nextLong();

        long multiply = 0;
        int digit;
        int factor = 1;

        while(second_binary != 0) {
            digit = (int) (second_binary % 10);
            if(digit == 1) {
                first_binary = first_binary * factor;
                multiply = binaryproduct((int) first_binary, (int) multiply);
            } else {
                first_binary *= factor;
            }
            second_binary /= 10;
            factor = 10;
        }

        System.out.print("Product of two binary numbers: " + multiply + "\n");

    }
    
    static int binaryproduct(int first_binary, int second_binary) {
        int index = 0;
        int remainder = 0;
        int sum[] = new int[20];
        int binary_product_result = 0;

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
            
            while(index >= 0) {
                binary_product_result = binary_product_result * 10 + sum[index--];
            }

            return binary_product_result;
        }
    }