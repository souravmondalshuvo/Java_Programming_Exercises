/*
Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
*/

import java.util.*;
public class HexagonArea {

    public static double AreaOfHexagon(double l) {

        return ((6 * l * l) / (4 * Math.tan(Math.PI / 6)));
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the length of a side of the hexagon: ");
        double length = sc.nextDouble();

        System.out.println("The area of the hexagon is: " + AreaOfHexagon(length));
    }
}