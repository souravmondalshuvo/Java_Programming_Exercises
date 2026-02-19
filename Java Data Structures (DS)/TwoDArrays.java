import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row size of the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the column size of the matrix: ");
        int column = sc.nextInt();

        int[][] matrix = new int[rows][column];

        //input

        //rows
        for(int i = 0; i < rows; i++) {
            //column
            for(int j = 0; j < column; j++) {
                System.out.print("Enter your [" + i + "] [" + j + "] matrices value: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the value of your matrix you wanna find the indices: ");
        int x = sc.nextInt();

        //output

        //rows
        for(int i = 0; i < rows; i++) {
            //column
            for(int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        //search

        //rows
        for(int i = 0; i < rows; i++) {
            //column
            for(int j = 0; j < column; j++) {
                
                if(x == matrix[i][j]) {
                    System.out.println("Number found at (" + i + ", " + j + ") indeces. ");
                }
            }
        }
    }    
}