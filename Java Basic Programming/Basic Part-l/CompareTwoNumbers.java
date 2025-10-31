/* 
Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39
25 <= 39   
*/

import java.util.*;
public class CompareTwoNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first integer: ");
        int first_number = sc.nextInt();

        System.out.print("Input second integer: ");
        int second_number = sc.nextInt();

        if(first_number == second_number) {
            System.out.println(first_number + " == " + second_number);
        } 
        if(first_number != second_number) {
            System.out.println(first_number + " != " + second_number);
        }
        if(first_number < second_number) {
            System.out.println(first_number + " < " + second_number);
        }
        if(first_number > second_number) {
            System.out.println(first_number + " > " + second_number);
        }
        if(first_number <= second_number) {
            System.out.println(first_number + " <= " + second_number);
        } else {
            System.out.println(first_number + " >= " + second_number);
        }
    }
}
