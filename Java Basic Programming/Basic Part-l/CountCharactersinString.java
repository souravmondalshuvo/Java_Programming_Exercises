/*
Write a Java program to count letters, spaces, numbers and other characters in an input string.
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23                                               
space: 9                                                 
number: 10                                               
other: 6
*/

import java.util.*;
public class CountCharactersinString {

    public static void count(String s1) {
        
        char ch[] = s1.toCharArray();

        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for(int i = 0; i < s1.length(); i++) {
            if(Character.isLetter(ch[i])) {
                letter++;
            } else if(Character.isSpaceChar(ch[i])) {
                space++;
            } else if(Character.isDigit(ch[i])) {
                number++;
            } else {
                other++;
            }
        }

        System.out.println("The string is: " + s1);

        System.out.println("Letter: " + letter);
        System.out.println("Space: " + space);
        System.out.println("Number: " + number);
        System.out.println("Other: " + other);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a string: ");
        String input = sc.nextLine();

        count(input);
    }
}