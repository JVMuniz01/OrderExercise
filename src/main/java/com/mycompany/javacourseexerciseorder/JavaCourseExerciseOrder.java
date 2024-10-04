
package com.mycompany.javacourseexerciseorder;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class JavaCourseExerciseOrder {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter client data:");
		System.out.print("Name: ");
        String name = s.nextLine();
        
		System.out.print("Email: ");
        String email = s.next();
        
		System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(s.next());
        
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter the order data: ");
        System.out.println("Status: ");
        OrderStatus status = OrderStatus.valueOf(s.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order? ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.println("Product name: ");
            s.nextLine();
            String productName = s.nextLine();

            System.out.println("Product price: ");
            double productPrice = s.nextDouble();

            System.out.println("Quantity: ");
            int quantity = s.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(productPrice, product, quantity);

            order.addItem(it);
            System.out.println();
            System.out.println(order);
        }


        s.close();
    }
}
