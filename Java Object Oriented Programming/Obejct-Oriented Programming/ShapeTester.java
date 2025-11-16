//Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".

public class ShapeTester {
    public static void main(String[] args) {
        
        Shape rectangle = new Rectangle1(10, 12);
        Shape circle = new Circle1(5);
        Shape triangle = new Triangle(7, 8, 6);

        System.out.println("Area and perimeter of various shapes: ");

        System.out.println("\nRectangle: Length=10, Width=12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nCircle: Radius=5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("\nTriangle: Side1=7, Side2=8, Side3=6");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}