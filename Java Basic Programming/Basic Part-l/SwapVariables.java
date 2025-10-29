/*
Write a Java program to swap two variables.
*/

import java.util.*;
public class SwapVariables {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first variable: ");
        int first_number = sc.nextInt();
        System.out.println("Enter your second variable: ");
        int second_number = sc.nextInt();

        int temp;

        System.out.println("This was your first variable: " + first_number);
        System.out.println("This was your second variable: " + second_number);

        temp = first_number;
        first_number = second_number;
        second_number = temp;

        System.out.println("Now this is your first variable: " + first_number);
        System.out.println("Now this is your second variable: " + second_number);

        sc.close();
    }
}