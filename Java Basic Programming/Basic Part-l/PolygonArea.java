/*
Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
*/

import java.util.*;
public class PolygonArea {

    public static double AreaOfPolygon(double num_of_sides, double s) {
        return (num_of_sides * s * s) / (4 * Math.tan(Math.PI / num_of_sides));
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the number of sides on the polygon: ");
        double number_of_sides = sc.nextDouble();

        System.out.print("Input the length of one of the sides: ");
        double sides = sc.nextDouble();

        System.out.println("The area is: " + AreaOfPolygon(number_of_sides, sides));
    }
}