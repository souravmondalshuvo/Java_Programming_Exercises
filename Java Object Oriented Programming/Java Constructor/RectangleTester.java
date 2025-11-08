public class RectangleTester {
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(12.5, 4.5);
        System.out.println("Rectangle 1 Length: " + rect1.length);
        System.out.println("Rectangle 1 Width: " + rect1.width);

        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("Rectangle 2 Length: " + rect2.length);
        System.out.println("Rectangle 2 Width: " + rect2.width);
    }
}