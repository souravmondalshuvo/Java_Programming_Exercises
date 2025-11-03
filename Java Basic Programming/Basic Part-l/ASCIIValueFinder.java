/*
Write a Java program to print the ASCII value of a given character.
Expected Output

The ASCII value of Z is :90
*/

import java.util.*;
public class ASCIIValueFinder {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the character: ");
        char ch = sc.next().charAt(0);

        int ascii_value = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii_value);
    }
}