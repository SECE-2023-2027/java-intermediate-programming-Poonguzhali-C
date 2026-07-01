package Problem1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        String id = sc.next();

        System.out.print("Enter Product Name: ");
        String name = sc.next();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Quantity: ");
        int stock = sc.nextInt();

        Product p = new Product(id, name, price, stock);

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        p.applyDiscount(discount);

        System.out.println("Price after discount: " + p.getPrice());
        System.out.println("Stock Quantity: " + p.getStockQuantity());

        sc.close();
    }
}
