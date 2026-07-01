package Problem6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Width: ");
        double width = sc.nextDouble();

        System.out.print("Enter Side: ");
        int side = sc.nextInt();

        System.out.println("Circle Area = " + AreaCalculator.calculateArea(radius));
        System.out.println("Rectangle Area = " + AreaCalculator.calculateArea(length, width));
        System.out.println("Square Area = " + AreaCalculator.calculateArea(side));

        sc.close();
    }
}
