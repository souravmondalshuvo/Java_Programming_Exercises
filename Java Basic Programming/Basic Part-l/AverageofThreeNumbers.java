/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/

import java.util.*;
public class AverageofThreeNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your first number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter your first number: ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;

        double average = sum / 3;

        System.out.println("The average of three numbers are " + average + ".");
    }
}
