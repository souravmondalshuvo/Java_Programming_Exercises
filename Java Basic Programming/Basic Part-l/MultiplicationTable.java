
import java.util.Scanner;

/*
Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 
*/

public class MultiplicationTable {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number for the multiplication table upto 10: ");
        int number = sc.nextInt();

        //multiplication table up to 10
        for (int i = 1; i <= 10; i++) {
            int multiply = number * i;
            System.out.println(number + " x " + i + " = " + multiply);
        }

        sc.close();
    }
}
