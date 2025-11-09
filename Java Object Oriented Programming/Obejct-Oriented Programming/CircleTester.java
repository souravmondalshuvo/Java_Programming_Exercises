//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.

public class CircleTester {
    public static void main(String[] args) {
        
        int r = 5;

        Circle circle = new Circle(r);
        System.out.println("Radius of the circle is " + r);
        System.out.println("The area of the circle is " + circle.getArea());
        System.out.println("The circumference of the circle is " + circle.getCircumference());

        r = 8;
        circle.setRadius(r);
        System.out.println("\nRadius of the circle is " + r);
        System.out.println("The area of the circle is now " + circle.getArea());
        System.out.println("The circumference of the circle is now " + circle.getCircumference());
    }
}