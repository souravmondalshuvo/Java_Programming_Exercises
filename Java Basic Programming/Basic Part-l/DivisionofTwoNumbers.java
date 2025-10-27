/*
Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16
*/

public class DivisionofTwoNumbers {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 3;
        int division = num1 / num2;
        System.out.print("Division of " + num1 + " by " + num2 + " is: ");
        System.out.println(division);
    }
}
