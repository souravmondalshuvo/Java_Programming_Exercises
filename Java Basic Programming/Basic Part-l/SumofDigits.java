/*
Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
*/

import java.util.*;
public class SumofDigits {

    public static int sumDigits(int num) {
        
        int sum = 0;

        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int number = sc.nextInt();

        System.out.println("The sum of the digits is: " + sumDigits(number));
    }
}