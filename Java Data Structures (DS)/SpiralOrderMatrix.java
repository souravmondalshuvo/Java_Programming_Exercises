/*
Print the 5 x 6 spiral order matrix as output for a given matrix of numbers.

Spiral Order is given by:

1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9 6 10 12 13 20 32 68 63 59 55 25 29 30 29

*/

import java.util.*;

public class SpiralOrderMatrix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the row number of the matrix: ");
        int row_size = sc.nextInt();
        System.out.print("Enter the column number of the matrix: ");
        int column_size = sc.nextInt();

        int matrix[][] = new int[row_size][column_size];

        //input

        //rows
        for(int i = 0; i < row_size; i++) {
            //column
            for(int j = 0; j < column_size; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is: ");

        int row_start = 0;
        int row_end = row_size - 1;
        
        int column_start = 0;
        int column_end = column_size - 1;

        //printing spiral order matrix

        while(row_start <= row_end && column_start <= column_end) {

            //case 1

            for(int col = column_start; col <= column_end; col++) {
                System.out.print(matrix[row_start][col] + " ");
            }

            row_start++;

            //case 2

            for(int row = row_start; row <= row_end; row++) {
                System.out.print(matrix[row][column_end] + " ");
            }

            column_end--;

            //case 3

            if(row_start <= row_end) {
                for(int col = column_end; col >= column_start; col--) {
                    System.out.print(matrix[row_end][col] + " ");
                }

                row_end--;
            }

            //case 4

            if(column_start <= column_end) {
                for(int row = row_end; row >= row_start; row--) {
                    System.out.print(matrix[row][column_start] + " ");
                }

                column_start++;
            }
        }

        sc.close();
    }
}