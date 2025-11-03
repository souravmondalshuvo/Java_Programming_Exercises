//Parameterized Constructor

class Dog {

    public String name;
    public String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

public class DogTester {
    public static void main(String[] args) {
        
        Dog myDog = new Dog("Bailey", "Black");

        System.out.println("Dog's Name: " + myDog.name);
        System.out.println("Dog's Color: " + myDog.color);
    }
}