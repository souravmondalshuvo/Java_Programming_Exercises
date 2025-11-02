/*
Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km
*/

import java.util.*;
public class DistanceBetweenTwoPoints {

    public static double distance(double latitude_coordinate_1, double longitude_coordinate_1, double latitude_coordinate_2, double longitude_coordinate_2) {
        
        latitude_coordinate_1 = Math.toRadians(latitude_coordinate_1);
        longitude_coordinate_1 = Math.toRadians(longitude_coordinate_1);
        latitude_coordinate_2 = Math.toRadians(latitude_coordinate_2);
        longitude_coordinate_2 = Math.toRadians(longitude_coordinate_2);

        double radius = 6371.01;

        return radius * Math.acos(Math.sin(latitude_coordinate_1) * Math.sin(latitude_coordinate_2) + Math.cos(latitude_coordinate_1) * Math.cos(latitude_coordinate_2) * Math.cos(longitude_coordinate_1 - longitude_coordinate_2));
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate 1: ");
        double latitude_coordinate_1 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double longitude_coordinate_1 = sc.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double latitude_coordinate_2 = sc.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double longitude_coordinate_2 = sc.nextDouble();

        System.out.println("The distance between those points is: " + distance(latitude_coordinate_1, longitude_coordinate_1, latitude_coordinate_2, longitude_coordinate_2) + " km");
    }
}