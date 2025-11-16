public class Triangle extends Shape {
    
    private double side_1;
    private double side_2;
    private double side_3;

    public Triangle(double side_1, double side_2, double side_3) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
    }

    public double getArea() {
        double s = (side_1 + side_2 + side_3) / 2;
        return Math.sqrt(s * (s - side_1) * (s - side_2) * (s - side_3));
    }

    public double getPerimeter() {
        return side_1 + side_2 + side_3;
    }
}