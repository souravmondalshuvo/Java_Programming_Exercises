/* 
Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13
*/

public class ArithmeticOperations {
    public static void main(String[] args) {
        
        //Test Case 1 (a)
        int num1 = -5;
        int num2 = 8;
        int num3 = 6;
        int arithmetic_operations_1 = num1 + num2 * num3;
        System.out.println("The Result of the 'Test Case 1 (a)' is: "+arithmetic_operations_1);

        //Test Case 2 (b)
        int num4 = 55;
        int num5 = 9;
        int num6 = 9;
        int arithmetic_operations_2 = (num4 + num5) % num6;
        System.out.println("The Result of the 'Test Case 2 (b)' is: "+arithmetic_operations_2);

        //Test Case 3 (c)
        int num7 = 20;
        int num8 = -3;
        int num9 = 5;
        int num10 = 8;
        int arithmetic_operations_3 = num7 + num8 * num9 / num10;
        System.out.println("The Result of the 'Test Case 3 (c)' is: "+arithmetic_operations_3);

        //Test Case 4 (d)
        int num11 = 5;
        int num12 = 15;
        int num13 = 3;
        int num14 = 2;
        int num15 = 8;
        int num16 = 3;
        int arithmetic_operations_4 = num11 + num12 / num13 * num14 - num15 % num16;
        System.out.println("The Result of the 'Test Case 4 (d)' is: "+arithmetic_operations_4);
    }
}