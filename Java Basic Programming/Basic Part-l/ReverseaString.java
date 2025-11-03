/*
Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
*/

import java.util.*;
public class ReverseaString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string: ");
        String input = sc.nextLine();

        System.out.print("Reverse string: ");
        for(int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            
            System.out.print(c);
        }

        System.out.println();
    }
}