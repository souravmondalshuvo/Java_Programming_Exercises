/*
Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output
2.138888888888889
*/

public class ExpressionEvaluation {
    public static void main(String[] args) {

        //Direct Printing the Output with the Values
        
        System.out.println((double) ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

        //Printing the Output with Storing the Values in Variables

        double num1 = 25.5;
        double num2 = 3.5;
        double num3 = 40.5;
        double num4 = 4.5;
        double output = ((num1 * num2 - num2 * num2) / (num3 - num4));
        System.out.println(output);
    }
}
