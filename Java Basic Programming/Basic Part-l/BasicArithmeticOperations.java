import java.util.*;

/*
Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
*/

public class BasicArithmeticOperations {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int first_number = sc.nextInt();
        System.out.print("Enter your second number: ");
        int second_number = sc.nextInt();

        int sum = first_number + second_number;             //addition
        int multiply = first_number * second_number;        //multiply
        int subtract = first_number - second_number;        //subtract
        int divide = first_number / second_number;          //divide
        int remainder = first_number % second_number;       //remainder

        System.out.println(first_number + " + " + second_number + " = " + sum);
        System.out.println(first_number + " - " + second_number + " = " + subtract);
        System.out.println(first_number + " x " + second_number + " = " + multiply);
        System.out.println(first_number + " / " + second_number + " = " + divide);
        System.out.println(first_number + " mod " + second_number + " = " + remainder);

        sc.close();
    }
}
