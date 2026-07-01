package Problem8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Circle Radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter Rectangle Width: ");
        double width = sc.nextDouble();

        System.out.print("Enter Rectangle Height: ");
        double height = sc.nextDouble();

        Shape s1 = new Circle(radius);
        Shape s2 = new Rectangle(width, height);

        System.out.println("Circle Area = " + Math.round(s1.getArea()));
        System.out.println("Rectangle Area = " + s2.getArea());

        sc.close();
    }
}
