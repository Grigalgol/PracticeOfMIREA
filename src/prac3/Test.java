package prac3;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "blue", true);
        System.out.println("Circle:");
        System.out.println(circle);

        System.out.println("====================================================================");

        Rectangle rectangle = new Rectangle("red", false, 25, 10);
        System.out.println("Rectangle:");
        System.out.println(rectangle);
    }

}
